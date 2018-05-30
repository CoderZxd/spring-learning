package com.zxd.spring.test.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-05-30 23:14
 **/
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
