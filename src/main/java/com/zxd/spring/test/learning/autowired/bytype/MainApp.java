package com.zxd.spring.test.learning.autowired.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.autowire.byname
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-04 22:55
 **/
public class MainApp {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ByType.xml");
        TextEditor tx = applicationContext.getBean("textEditor",TextEditor.class);
        tx.spellCheck();
    }
}
