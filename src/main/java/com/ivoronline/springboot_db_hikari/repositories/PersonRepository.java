package com.ivoronline.springboot_db_hikari.repositories;

import com.ivoronline.springboot_db_hikari.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {}
