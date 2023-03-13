package ru.matrosov.prac10.models;

import org.springframework.stereotype.Component;


public class Junior implements Programmer {
    public String doCoding() {
        return "junior";
    }
}
