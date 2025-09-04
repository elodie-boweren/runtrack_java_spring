package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {
    @Value(value = "${greeting.message}")
    private String greetingMessage;

    @GetMapping("/elodie")   // Associe l’URL "/" à cette méthode
    public String greeting() {
        return greetingMessage;
    }
}