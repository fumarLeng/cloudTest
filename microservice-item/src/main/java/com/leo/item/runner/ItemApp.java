package com.leo.item.runner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.leo.item")
@EnableJpaRepositories(basePackages = "com.leo.item.repo")
@EntityScan(basePackages = "com.leo.item.entity")
public class ItemApp {

    public static void main(String[] args) {
        SpringApplication.run(ItemApp.class, args);
    }
}




