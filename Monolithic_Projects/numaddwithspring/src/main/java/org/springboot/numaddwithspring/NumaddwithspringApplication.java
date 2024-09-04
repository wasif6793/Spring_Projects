package org.springboot.numaddwithspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

@Configuration
public class NumaddwithspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(NumaddwithspringApplication.class, args);

        System.out.println("hi");
    }


}
