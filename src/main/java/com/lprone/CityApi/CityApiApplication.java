package com.lprone.CityApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.lprone.CityApi.repository", "com.lprone.CityApi.resources"})
public class CityApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityApiApplication.class, args);
    }

}
