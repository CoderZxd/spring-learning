package com.zxd.spring.test.learning.event.handler.custom;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.event.handler.custom
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-07 0:20
 **/
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;
    /**
     * Set the ApplicationEventPublisher that this object runs in.
     * <p>Invoked after population of normal bean properties but before an init
     * callback like InitializingBean's afterPropertiesSet or a custom init-method.
     * Invoked before ApplicationContextAware's setApplicationContext.
     *
     * @param applicationEventPublisher event publisher to be used by this object
     */
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish(){
        CustomEvent customEvent = new CustomEvent(this);
        publisher.publishEvent(customEvent);
    }
}
