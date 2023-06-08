package com.michael1142.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    // http://localhost:8080/home/blue?name=sometext
    @RequestMapping("/home/{color}")
    public String home(
            @PathVariable String color,
            @RequestParam(required = false) String name,
            Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
