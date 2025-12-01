package com.example.Practica5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Endpoint: http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "¡hello world!";
    }
}