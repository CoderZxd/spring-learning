package com.zxd.spring.test.learning.annotation.required;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.required
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-05 0:06
 **/
public class Student {

    private Integer age;

    private String name;

    public Integer getAge() {
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
