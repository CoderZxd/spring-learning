package com.zxd.spring.test.learning.aspectj.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.aspectj.annotation.test
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-11 1:22
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("AspectJAnnotation.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
//        student.printThrowException();
    }
}
