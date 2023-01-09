package com.pilote2.demo;

import com.pilote2.demo.entities.Category;
import com.pilote2.demo.enums.CategoryStatus;
import com.pilote2.demo.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Pilote2Application {

    public static void main(String[] args) {
        SpringApplication.run(Pilote2Application.class, args);
    }




//    @Bean
//    CommandLineRunner start(CategoryRepository categoryRepository) {
//        return args -> {
//            Stream.of("mounir", "nabila", "hichem").forEach(name -> {
//               Category category = new Category();
//                category.setName(name);
//                category.setDescription(name + " descriii... ");
//                categoryRepository.save(category);
//            });
//
//        };
//    }
}