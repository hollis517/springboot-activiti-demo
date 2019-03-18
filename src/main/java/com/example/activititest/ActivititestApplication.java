package com.example.activititest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@ComponentScan({"com.example.activititest","org.activiti"})
public class ActivititestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivititestApplication.class, args);
    }

}
