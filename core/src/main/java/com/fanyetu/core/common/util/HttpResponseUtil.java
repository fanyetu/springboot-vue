package com.fanyetu.core.common.util;

import com.fanyetu.core.common.result.ResultCode;
import org.apache.http.entity.ContentType;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author zhanghaonan
 * @date 2018/11/29
 */
public class HttpResponseUtil {

    public static void writeSuccessJson(HttpServletResponse response, String result) throws IOException {
        response.setStatus(HttpStatus.OK.value());
        writeJson(response, result);
    }

    public static void writeUnauthorizedJson(HttpServletResponse response, String result) throws IOException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        writeJson(response, result);
    }

    public static void writeJson(HttpServletResponse response, String result) throws IOException {
        response.setContentType(ContentType.APPLICATION_JSON.withCharset(StandardCharsets.UTF_8).toString());
        PrintWriter out = response.getWriter();
        out.write(result);
        out.flush();
        out.close();
    }
}
