package ru.matrosov.prac10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.matrosov.prac10.config.BeanConfig;
import ru.matrosov.prac10.models.ConcreteProgrammer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ConcreteProgrammer concreteProgrammer = context.getBean(ConcreteProgrammer.class);
        concreteProgrammer.goCode();
    }
}
