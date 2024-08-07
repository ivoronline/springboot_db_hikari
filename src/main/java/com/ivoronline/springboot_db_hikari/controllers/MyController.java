package com.ivoronline.springboot_db_hikari.controllers;

import com.ivoronline.springboot_db_hikari.entities.Person;
import com.ivoronline.springboot_db_hikari.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired
  PersonRepository personRepository;

  //================================================================
  // FIND PERSON BY ID
  //================================================================
  @RequestMapping("FindPersonById")
  Person findPersonById() {
    Person person = personRepository.findById(1).get();
    return person;
  }

}

