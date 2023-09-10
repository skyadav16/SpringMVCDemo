package com.sky.java.SpringMVCDemo.service;

import com.sky.java.SpringMVCDemo.Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final Map<String, Person> personRepo = new HashMap<>();

    public void addPerson(Person person) {
        personRepo.put(person.getFirstName(), person);
    }

    public Person getPerson(String firstName) {
        return personRepo.get(firstName);
    }

    public List<Person> getPersons() {
        return new ArrayList<>(personRepo.values());
    }
}
