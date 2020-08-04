package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//connected to ProfileController.java, home.html
@Controller
public class HomeController {
    @GetMapping("/")
//    @ResponseBody
    public String returnLandingMessage(){
        //return home.html
        return "home";
    }

    @PostMapping("/")
    public String returnCohort(@RequestParam(name = "cohort") String cohort, Model model){
        model.addAttribute("cohort", cohort);
        return "home";
    }
}
