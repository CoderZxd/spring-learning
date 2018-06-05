package com.zxd.spring.test.learning.annotation.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.configuration
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-06 0:03
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx.getBean(TextEditor.class);
        TextEditor te2 = ctx.getBean(TextEditor.class);

        te.spellCheck();
        te2.spellCheck();
    }
}
