package com.kun.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloworldController {

    @GetMapping("/")
    public String displayHelloWorld() {
        return "Index";

        /*
         * if not using prefix and suffix in application.properties, then the code
         * should be written like this: return "/WEB-INF/Index.jsp";
         */
    }
}