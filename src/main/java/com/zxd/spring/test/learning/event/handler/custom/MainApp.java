package com.zxd.spring.test.learning.event.handler.custom;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.event.handler.custom
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-07 0:24
 **/
public class MainApp {
    public static void main(String[] args){
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("CustomEvent.xml");
        CustomEventPublisher customEventPublisher = (CustomEventPublisher)configurableApplicationContext.getBean("customEventPublisher");
        customEventPublisher.publish();
        customEventPublisher.publish();
    }
}
