package com.zxd.spring.test.learning.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.event.handler
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-06 0:34
 **/

public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent Received");
    }
}
