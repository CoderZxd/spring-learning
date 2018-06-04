package com.zxd.spring.test.learning.annotation.qualifierr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.qualifierr
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-05 0:50
 **/
public class MainApp {

    public static void main(String[] atgs){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Qualifier.xml");
        Profile profile = applicationContext.getBean("profile",Profile.class);
        profile.prinntStudentInfo();
    }
}
