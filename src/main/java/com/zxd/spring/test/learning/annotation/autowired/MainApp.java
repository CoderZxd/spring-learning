package com.zxd.spring.test.learning.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.autowired
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-05 0:27
 **/
public class MainApp {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Autowired.xml");
        TextEditor textEditor = applicationContext.getBean("textEditor",TextEditor.class);
        textEditor.spellCheck();
    }
}
