package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class MathController {

    @GetMapping("/add/{num1}/and{num2}")
    @ResponseBody
    public int add(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    @GetMapping("/sub/{num1}/and{num2}")
    @ResponseBody
    public int sub(@PathVariable int num1, @PathVariable int num2){
        return num1 - num2;
    }

    @GetMapping("/multi/{num1}/and{num2}")
    @ResponseBody
    public int multi(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }

    @GetMapping("/div/{num1}/and{num2}")
    @ResponseBody
    public int div(@PathVariable int num1, @PathVariable int num2){
        return num1 / num2;
    }
}
