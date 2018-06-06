package com.zxd.spring.test.learning.event.handler.custom;

import org.springframework.context.ApplicationEvent;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.event.handler.custom
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-07 0:18
 **/
public class CustomEvent extends ApplicationEvent{
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "My Customer Event";
    }
}
