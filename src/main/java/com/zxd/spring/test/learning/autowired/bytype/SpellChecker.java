package com.zxd.spring.test.learning.autowired.bytype;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.autowire.byname
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-04 22:52
 **/
public class SpellChecker {

    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor.--by type" );
    }
    public void checkSpelling() {
        System.out.println("Inside checkSpelling by type." );
    }
}
