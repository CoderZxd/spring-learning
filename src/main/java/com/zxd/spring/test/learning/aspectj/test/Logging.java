package com.zxd.spring.test.learning.aspectj.test;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.aspectj.test
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-10 23:41
 **/
public class Logging {

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }

    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }

    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
