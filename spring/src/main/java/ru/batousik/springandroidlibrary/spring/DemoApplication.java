package ru.batousik.springandroidlibrary.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ru.batousik.springandroidlibrary.javalib.LibClass;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        System.out.println(LibClass.LIB_DATA);
        SpringApplication.run(DemoApplication.class, args);
    }
}
