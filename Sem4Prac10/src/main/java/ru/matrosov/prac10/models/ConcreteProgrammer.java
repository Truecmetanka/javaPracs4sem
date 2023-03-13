package ru.matrosov.prac10.models;

import org.springframework.stereotype.Component;

@Component
public class ConcreteProgrammer {
    private Programmer programmer;

    public ConcreteProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void goCode() {
        System.out.println("I'm " + programmer.doCoding() + " programmer");
    }
}
