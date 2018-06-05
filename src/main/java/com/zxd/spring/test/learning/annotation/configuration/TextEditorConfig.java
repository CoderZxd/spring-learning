package com.zxd.spring.test.learning.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.annotation.configuration
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-06 0:02
 **/
@Configuration
public class TextEditorConfig {

    @Bean
    @Scope(value = "prototype")
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    @Bean
//    @Scope(value = "prototype")
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
