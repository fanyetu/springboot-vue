package com.fanyetu.core.auth.custom;

import com.fanyetu.core.common.result.Result;
import com.fanyetu.core.common.result.ResultCode;
import com.fanyetu.core.common.result.ResultGenerator;
import com.fanyetu.core.common.util.HttpResponseUtil;
import com.fanyetu.core.common.util.JacksonUtil;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 自定义权限不足时的处理
 *
 * @author zhanghaonan
 * @date 2018/11/28
 */
@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException, ServletException {
        Result result = ResultGenerator.genResult(ResultCode.FORBIDDEN, "权限不足，请联系管理员");
        response.setStatus(HttpStatus.FORBIDDEN.value());
        HttpResponseUtil.writeJson(response, JacksonUtil.objectToJSON(result));
    }
}
