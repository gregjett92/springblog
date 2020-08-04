package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
    //could change to profile
    @PostMapping("/login")
    public String viewLoginInfo(@RequestParam(name = "username") String username, @RequestParam(name="password") String password, Model model){
        model.addAttribute(username,password);
        model.addAttribute(username,password);
        return "login";
    }
}
