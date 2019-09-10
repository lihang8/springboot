package com.springboot;

import com.springboot.datasources.DBConfig1;
import com.springboot.datasources.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({DBConfig1.class, DBConfig2.class})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class ,args);
    }
}
