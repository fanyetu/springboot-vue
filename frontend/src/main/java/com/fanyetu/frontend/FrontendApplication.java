package com.fanyetu.frontend;

import com.fanyetu.core.auth.service.MenuService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhanghaonan
 */
@SpringBootApplication
@ComponentScan("com.fanyetu")
@MapperScan("com.fanyetu.**.mapper")
public class FrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontendApplication.class, args);
    }

}
