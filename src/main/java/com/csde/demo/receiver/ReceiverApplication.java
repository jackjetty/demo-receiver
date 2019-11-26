package com.csde.demo.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {"com.csde"})
public class ReceiverApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ReceiverApplication.class, args);

    }
}