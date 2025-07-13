package com.cognizant.Rest_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country.xml")
public class RestDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestDemoApplication.class, args);
    }
}
