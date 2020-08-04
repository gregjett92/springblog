package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/post")
    @ResponseBody
    public String index() {
        return "Here are all of the post";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String show(@PathVariable long id) {
        return "Here is a post with the id: " + id ;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "Here is a form to create a post!" ;
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String insert() {
        return "Post has been created!" ;
    }

}
