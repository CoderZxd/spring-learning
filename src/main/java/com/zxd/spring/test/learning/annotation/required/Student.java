package com.zxd.spring.test.learning.annotation.required;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.required
 * @description:
 * @Required 注释应用于 bean 属性的 setter 方法，
 * 它表明受影响的 bean 属性在配置时必须放在 XML 配置文件中，
 * 否则容器就会抛出一个 BeanInitializationException 异常。
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
