package com.example.amigoscode.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunnernner(StudentRepository repository) {
        return args -> {
          Student nariam =  new Student(

                    "Nariam",
                    "nariam@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
          );

          Student alex =  new Student(
                  "Alex",
                  "Alexm@gmail.com",
                  LocalDate.of(2010, MARCH, 5)
          );
        repository.saveAll(
                List.of(nariam, alex)
            );
        };
    }
}
