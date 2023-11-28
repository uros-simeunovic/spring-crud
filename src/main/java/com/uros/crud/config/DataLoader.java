package com.uros.crud.config;

import com.uros.crud.model.Student;
import com.uros.crud.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader {

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

//    @Override
//    public void run(String... args) throws Exception {
//        Student mariam = new Student(
//                1L,
//                "Mariam",
//                "mariam@gmail.com"
//        );
//
//        Student alex = new Student(
//                2L,
//                "Alex",
//                "alex@gmail.com"
//        );
//
//        repository.saveAll(List.of(mariam, alex));
//    }
}
