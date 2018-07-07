package com.ote.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestServiceRunner {

    public static void main(String[] args) {
        SpringApplication.run(TestServiceRunner.class, args);
    }

    @Bean
    public CommandLineRunner run(@Value("${spring.application.name}") String applicationName){
        return (args) -> {
            System.out.println(applicationName);
        };
    }
}