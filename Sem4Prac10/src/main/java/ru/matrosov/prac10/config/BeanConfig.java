package ru.matrosov.prac10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.matrosov.prac10.models.ConcreteProgrammer;
import ru.matrosov.prac10.models.Junior;
import ru.matrosov.prac10.models.Programmer;

@Configuration
@ComponentScan
public class BeanConfig {

    @Bean
    public Programmer programmer() {
        return new Junior();
    }

    @Bean
    public ConcreteProgrammer concreteProgrammer(Programmer programmer) {
        ConcreteProgrammer concreteProgrammer = new ConcreteProgrammer(programmer); //внедеряем с помощью конструктора
        return concreteProgrammer;
    }


}
