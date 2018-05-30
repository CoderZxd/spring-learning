package com.zxd.spring.test.learning;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-05-30 23:13
 **/
public class HelloWorld implements InitializingBean{
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public void init(){
        System.out.println("============init=====================");
    }

    public void destory(){
        System.out.println("============destory=====================");
    }

    /**
     * Invoked by a BeanFactory after it has set all bean properties supplied
     * (and satisfied BeanFactoryAware and ApplicationContextAware).
     * <p>This method allows the bean instance to perform initialization only
     * possible when all bean properties have been set and to throw an
     * exception in the event of misconfiguration.
     *
     * @throws Exception in the event of misconfiguration (such
     *                   as failure to set an essential property) or if initialization fails.
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println("============afterPropertiesSet=====================");
    }
}
