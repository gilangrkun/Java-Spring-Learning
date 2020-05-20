package com.kun.springmvc.studentcards.controllers;

import java.util.List;

import com.kun.springmvc.studentcards.models.Studentcards;
import com.kun.springmvc.studentcards.services.IStudentcards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentcardsController {

    @Autowired
    private IStudentcards studentcardsService;

    @GetMapping("/showCards")
    public String findCards(Model model) {

        var cards = (List<Studentcards>) studentcardsService.findAll();

        model.addAttribute("studentCards", cards);

        return "showCards";
    }
}