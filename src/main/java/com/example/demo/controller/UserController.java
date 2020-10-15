package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class UserController {
    @GetMapping
    public String showHome(@ModelAttribute("user") User user) {
        return "addForm";
    }
    @PostMapping
    public String showHello(@Valid @ModelAttribute("user") User user, BindingResult result){
        if (result.hasFieldErrors()) return "addForm";
        return "welcome";
    }
}
