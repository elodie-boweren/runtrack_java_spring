package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/hello")
    public String hello(Model model) {
        // Ajoute une variable "message" qui sera envoyée à la vue
        model.addAttribute("message", "Bienvenue sur ma première page Thymeleaf 🚀");
        // Retourne le fichier view.html (sans l’extension)
        return "view";
    }
}