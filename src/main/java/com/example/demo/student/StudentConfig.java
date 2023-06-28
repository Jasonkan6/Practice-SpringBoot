package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
            Student jason = new Student(
                    "Jason",
                    "jkanaa@gmail.com",
                    LocalDate.of(2000, APRIL, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "alexx@gmail.com",
                    LocalDate.of(2004, FEBRUARY, 5)
            );
            repository.saveAll(
                    List.of(jason, alex)
            );
        };
    }
}
