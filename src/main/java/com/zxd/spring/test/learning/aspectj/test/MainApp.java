package com.zxd.spring.test.learning.aspectj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.aspectj.test
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-10 23:44
 **/
public class MainApp {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AspectJ.xml");
        Student student = (Student)applicationContext.getBean("student");
        student.getAge();
        student.getName();
        student.printThrowException();
    }
}
