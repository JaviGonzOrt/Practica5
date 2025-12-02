package com.example.Practica5.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rosaliaController {

    @GetMapping("/rosalia")
    public String hello() {
        return "¡hello world!";
    }
}