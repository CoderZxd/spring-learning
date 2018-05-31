package com.zxd.spring.test.learning.inner.beans;

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

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }

//    public TextEditor(SpellChecker spellChecker) {
//        System.out.println("Inside TextEditor constructor." );
//        this.spellChecker = spellChecker;
//    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
