package com.dpj.spring.controller;

import com.dpj.spring.mod.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired
    @Qualifier(value = "p1")
    private Person person;

}
