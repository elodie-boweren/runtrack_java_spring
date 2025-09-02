package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")   // Associe l’URL "/" à cette méthode
    public String sayHello() {
        return "Hello World";
    }
}