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
public class TextEditor2 {

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("set spellChecker");
        this.spellChecker = spellChecker;
    }


    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
