package com.alinina.test;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Attr {
    private static String h1 = "Заголовок 1";
    private static String h2 = "Заголовок 2";
    public String getH1(){
        return this.h1;
    }

    public String getH2(){
        return this.h2;
    }
}
