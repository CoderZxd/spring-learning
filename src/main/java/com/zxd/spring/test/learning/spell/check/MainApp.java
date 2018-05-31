package com.zxd.spring.test.learning.spell.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.spell.check
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-05-31 22:55
 **/
public class MainApp {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
        textEditor.spellCheck();
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("BeansForSetter.xml");
        TextEditor2 textEditor2 = (TextEditor2)applicationContext2.getBean("textEditor2");
        textEditor2.spellCheck();
    }
}
