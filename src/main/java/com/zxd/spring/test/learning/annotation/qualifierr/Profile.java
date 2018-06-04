package com.zxd.spring.test.learning.annotation.qualifierr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.qualifierr
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-05 0:48
 **/
public class Profile {

    @Autowired
    @Qualifier("student2")
    private Student student;

    public void prinntStudentInfo(){
        System.out.println("Name:"+student.getName());
        System.out.println("Age:"+student.getAge());
    }
}
