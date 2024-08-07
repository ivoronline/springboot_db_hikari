package com.ivoronline.springboot_db_hikari.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  //CONSTRUCTORS
  public Person() {}                          //Required by @Entity
  public Person(String name, Integer age) {   //For loading data
    this.name = name;
    this.age  = age;
  }

}
