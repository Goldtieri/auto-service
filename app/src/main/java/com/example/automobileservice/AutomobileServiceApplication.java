package com.example.automobileservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.example.automobileservice")
@SpringBootApplication
public class AutomobileServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutomobileServiceApplication.class, args);
    }

}
