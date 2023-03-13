package ru.matrosov.prac10.models;

import org.springframework.stereotype.Component;


public class Senior implements Programmer {
    public String doCoding() {
        return "senior";
    }
}