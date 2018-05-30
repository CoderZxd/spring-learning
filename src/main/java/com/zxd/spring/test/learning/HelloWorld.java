package com.zxd.spring.test.learning;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-05-30 23:13
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
