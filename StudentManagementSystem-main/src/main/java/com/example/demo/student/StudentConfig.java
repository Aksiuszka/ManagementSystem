package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.MAY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Fiona = new Student("Fiona", "Fiona@pieskowo.pl", LocalDate.of(2015, MAY, 22));
            Student Burek = new Student("Burek", "Burek@pieskowo.pl", LocalDate.of(2015, MAY, 22));
            repository.saveAll(List.of(Fiona, Burek));
        };
    }
}
