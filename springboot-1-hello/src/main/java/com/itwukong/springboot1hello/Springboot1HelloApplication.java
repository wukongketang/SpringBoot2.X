package com.itwukong.springboot1hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class Springboot1HelloApplication {

    private static Logger logger = LoggerFactory.getLogger(Springboot1HelloApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Springboot1HelloApplication.class, args);
    }


    @RequestMapping("hello")
    public String hello(){
        return "你好，悟空课堂";
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("查看  SpringBoot 默认创建好的 Bean：");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            Arrays.stream(beanNames).forEach(System.out::println);
        };
    }

}
