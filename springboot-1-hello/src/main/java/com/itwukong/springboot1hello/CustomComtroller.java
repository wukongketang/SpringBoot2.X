package com.itwukong.springboot1hello;

import com.itwukong.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * * @description: CustomComtroller
 * * @author: NOAH
 * * @create: 21:38
 * * @联系QQ:  300957295
 * * @copyright:  悟空课堂  www.itwukong.com
 **/
@RestController
public class CustomComtroller {

    @Resource
    DemoService demoService;

    @RequestMapping("testCustom")
    public String testCustom(){
        String data = demoService.demo();
        return data;
    }
}
