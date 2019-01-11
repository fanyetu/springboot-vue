package com.fanyetu.core.common.exception;

import cn.hutool.core.util.StrUtil;
import com.fanyetu.core.common.result.Result;
import com.fanyetu.core.common.result.ResultCode;
import com.fanyetu.core.common.util.JacksonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 统一异常处理
 *
 * @author zhanghaonan
 * @date 2018/11/28
 */
@Component
@Slf4j
public class CommonExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception e) {
        Result.ResultBuilder result = Result.builder();
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;

            //业务失败的异常，如“账号或密码错误”
            if (e instanceof ServiceException) {
                result.code(ResultCode.FAIL.getCode());

                String message = e.getMessage();
                if (message.indexOf("exception") > 0) {
                    message = "处理异常，请稍后重试";
                }
                result.msg(message);

                log.info(e.getMessage());
            } else {

                result.code(ResultCode.INTERNAL_SERVER_ERROR.getCode());
                result.msg("网络异常，请稍后重试。");
                String message = String.format("接口 [%s] 出现异常，方法：%s.%s，异常摘要：%s",
                        request.getRequestURI(),
                        handlerMethod.getBean().getClass().getName(),
                        handlerMethod.getMethod().getName(),
                        e.getMessage());
                log.error(message, e);
            }
        } else {
            if (e instanceof NoHandlerFoundException) {
                result.code(ResultCode.NOT_FOUND.getCode());
                result.msg("接口 [" + request.getRequestURI() + "] 不存在");
            } else {
                result.code(ResultCode.INTERNAL_SERVER_ERROR.getCode());
                result.msg(e.getMessage());
                log.error(e.getMessage(), e);
            }
        }
        StringBuilder resultStr = new StringBuilder();
        if (isRequestAJAX(request)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=UTF-8");
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            resultStr.append(JacksonUtil.objectToJSON(result.build()));
        } else {
            response.setContentType("text/html; charset=utf-8");
            response.setStatus(HttpStatus.OK.value());
            resultStr.append("<!doctype html>");
            resultStr.append("<html lang=\"en\">");
            resultStr.append("<head>");
            resultStr.append("<meta charset=\"UTF-8\">");
            resultStr.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, " +
                    "maximum-scale=1.0, minimum-scale=1.0, user-scalable=no\">");
            resultStr.append("<title>错误</title>");
            resultStr.append("</head>");
            resultStr.append("<body>");
            resultStr.append("<h1 style=\"text-align:center;color: #0199fd;\">网络错误，请稍后重试</h1>");
            resultStr.append("</body>");
            resultStr.append("</html>");
        }

        try (OutputStream out = response.getOutputStream()) {
            out.write(resultStr.toString().getBytes());
            out.flush();
        } catch (IOException e1) {
            log.error(e1.getMessage(), e1);
        }

        return new ModelAndView();
    }

    private Boolean isRequestAJAX(HttpServletRequest request) {
        String requestType = request.getHeader("Accept");
        if (StrUtil.isNotEmpty(requestType)) {
            if (StrUtil.containsIgnoreCase(requestType, "text/html")) {
                return false;
            }
        }
        return true;
    }
}
