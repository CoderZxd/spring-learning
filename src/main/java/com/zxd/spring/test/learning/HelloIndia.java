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
public class HelloIndia {
    private String message1;
    private String message2;
    private String message3;

    public void setMessage1(String message){
        this.message1  = message;
    }

    public void setMessage2(String message){
        this.message2  = message;
    }

    public void setMessage3(String message){
        this.message3  = message;
    }

    public void getMessage1(){
        System.out.println("India Message1 : " + message1);
    }

    public void getMessage2(){
        System.out.println("India Message2 : " + message2);
    }

    public void getMessage3(){
        System.out.println("India Message3 : " + message3);
    }

    public void getMessage(){
        System.out.println("India Message1 : " + message1);
        System.out.println("India Message2 : " + message2);
        System.out.println("India Message3 : " + message3);
    }
}
