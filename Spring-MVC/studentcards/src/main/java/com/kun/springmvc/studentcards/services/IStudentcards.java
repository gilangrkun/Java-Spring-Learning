package com.kun.springmvc.studentcards.services;

import java.util.List;

import com.kun.springmvc.studentcards.models.Studentcards;

public interface IStudentcards {
    List<Studentcards> findAll();
}