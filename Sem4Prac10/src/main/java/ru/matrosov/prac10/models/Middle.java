package ru.matrosov.prac10.models;

import org.springframework.stereotype.Component;

@Component
public class Middle implements Programmer {
    public String doCoding() {
        return "middle";
    }
}