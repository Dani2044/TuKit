package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/caracteristicas")
    public String caracteristicas() {
        return "caracteristicas";
    }

    @GetMapping("/proyecto")
    public String proyecto() {
        return "proyecto";
    }

    @GetMapping("/planes")
    public String planes() {
        return "planes";
    }

    @GetMapping("/descargar")
    public String descargar() {
        return "descargar";
    }
}