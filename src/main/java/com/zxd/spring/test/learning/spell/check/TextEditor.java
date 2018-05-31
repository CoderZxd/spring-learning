package com.zxd.spring.test.learning.spell.check;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.spell.check
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-05-31 22:51
 **/
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker,String value) {
        System.out.println("Inside TextEditor constructor.parameter 2 ="+value );
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
