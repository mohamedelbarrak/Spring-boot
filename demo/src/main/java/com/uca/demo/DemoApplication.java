package com.uca.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        //Hello hello = new Hello();
        //System.out.println(hello.displayMessage());
        SpringApplication.run(DemoApplication.class, args);
    }
}
