package com.in60minutes.java_Jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to the Home Page!";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Welcome to the Contact Page!";
    }
}
