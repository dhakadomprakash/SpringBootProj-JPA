package com.nt;//com.nt.SpringBootProjJpaApplication.java

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.nt")
public class SpringBootProjJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProjJpaApplication.class, args);
    }

}
