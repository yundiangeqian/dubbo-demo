package com.cm.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboProvider1Application.class, args);
    }

}
