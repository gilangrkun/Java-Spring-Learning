package com.kun.springmvc.studentcards.services;

import java.util.List;

import com.kun.springmvc.studentcards.models.Studentcards;
import com.kun.springmvc.studentcards.repositories.StudentcardsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentcardsService implements IStudentcards {

    @Autowired
    private StudentcardsRepository studentcardsRepository;

    @Override
    public List<Studentcards> findAll() {
        return (List<Studentcards>) studentcardsRepository.findAll();
    }
}