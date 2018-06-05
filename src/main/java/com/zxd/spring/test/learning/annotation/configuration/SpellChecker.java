package com.zxd.spring.test.learning.annotation.configuration;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.configuration
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-06 0:02
 **/
public class SpellChecker {
    public SpellChecker(){
        System.out.println(this.hashCode());
        System.out.println("Inside SpellChecker constructor." );
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling." );
    }
}
