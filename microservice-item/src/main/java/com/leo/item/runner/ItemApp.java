package com.leo.item.runner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.leo.item.controller","com.leo.item.service"})
public class ItemApp {

    public static void main(String[] args) {
        SpringApplication.run(ItemApp.class, args);
    }
}




