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
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("hashCode:"+this.hashCode());
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
