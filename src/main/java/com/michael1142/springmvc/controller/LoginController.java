package com.michael1142.springmvc.controller;

import com.michael1142.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/")
    public String logIn() {
        return "login";
    }
    @PostMapping("/")
    public String logIn(Model model,
                        @RequestParam User user) {
        if(user.getUsername().equals("Michael1142")
                && user.getPassword().equals("password")) {
            return"home";
        } else {
            model.addAttribute("message", "WTF!?");
            return "login";
        }
    }
}
