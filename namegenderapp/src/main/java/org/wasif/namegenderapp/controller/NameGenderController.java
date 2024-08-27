package org.wasif.namegenderapp.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wasif.namegenderapp.model.Person;
import org.wasif.namegenderapp.repository.PersonRepository;

import java.util.List;

@Controller
public class NameGenderController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "/")
    public String index(Model model) {
        List<Person> persons = personRepository.findAll();
        model.addAttribute("persons", persons);
        model.addAttribute("person", new Person());
        return "index";
    }

//    @PostMapping(value = "/add")
//    public String addPerson(@ModelAttribute Person person) {
//        personRepository.save(person);
//        return "redirect:/";
//    }
}
