package com.sky.java.SpringMVCDemo.controller;

import com.sky.java.SpringMVCDemo.Model.Person;
import com.sky.java.SpringMVCDemo.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
@Slf4j
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("{firstName}")
    public Person getPerson(@PathVariable String firstName) {
        log.info("first name - {}", firstName);
        return personService.getPerson(firstName);
    }

    @GetMapping
    public List<Person> getPerson() {
        return personService.getPersons();
    }
    @PostMapping
    public String addPerson(@RequestBody Person person) {
        personService.addPerson(person);
        log.info("person - {}", person);
        return "Person added successfully";
    }

}
