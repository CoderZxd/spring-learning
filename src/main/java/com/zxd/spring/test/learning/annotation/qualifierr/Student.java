package com.zxd.spring.test.learning.annotation.qualifierr;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.qualifierr
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-05 0:46
 **/
public class Student {
    private Integer age;
    private String name;
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
