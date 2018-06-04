package com.zxd.spring.test.learning.annotation.autowired;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.autowired
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-05 0:26
 **/
public class SpellChecker {
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor.by autowired" );
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling by autowired." );
    }
}
