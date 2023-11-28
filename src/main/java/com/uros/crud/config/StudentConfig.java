package com.uros.crud.config;

import com.uros.crud.model.Student;
import com.uros.crud.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam@gmail.com"
            );

            Student alex = new Student(
                    2L,
                    "Alex",
                    "alex@gmail.com"
            );

            repository.saveAll(List.of(mariam, alex));
        };
    }
}
