package com.efairway.shop.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.efairway")
public class ShopApplication extends SpringBootServletInitializer {
	
    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }


}
