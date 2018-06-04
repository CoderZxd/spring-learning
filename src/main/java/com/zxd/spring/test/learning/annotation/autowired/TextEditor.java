package com.zxd.spring.test.learning.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.autowired
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-05 0:26
 **/
public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;

//    @Autowired
//    public void setSpellChecker( SpellChecker spellChecker ){
//        this.spellChecker = spellChecker;
//    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
