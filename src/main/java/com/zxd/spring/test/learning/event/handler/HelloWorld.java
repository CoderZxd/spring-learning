package com.zxd.spring.test.learning.event.handler;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.event.handler
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-06 0:33
 **/
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
