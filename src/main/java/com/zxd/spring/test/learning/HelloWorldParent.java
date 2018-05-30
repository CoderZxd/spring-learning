package com.zxd.spring.test.learning;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-05-31 0:52
 **/
public class HelloWorldParent {
    private String message1;
    private String message2;
    public void setMessage1(String message){
        this.message1  = message;
    }
    public void setMessage2(String message){
        this.message2  = message;
    }
    public void getMessage1(){
        System.out.println("World Message1 : " + message1);
    }
    public void getMessage2(){
        System.out.println("World Message2 : " + message2);
    }
}
