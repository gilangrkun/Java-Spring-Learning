package com.kun.springmvc.studentcards.repositories;

import com.kun.springmvc.studentcards.models.Studentcards;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentcardsRepository extends CrudRepository<Studentcards, Long> {

}