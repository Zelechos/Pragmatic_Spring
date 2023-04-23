package dev.api.mongodb.controller;

import dev.api.mongodb.model.Person;
import dev.api.mongodb.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping("/save")
    public void save(@RequestBody Person person) {
        personService.save(person);
    }

    @GetMapping("/")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable String id) {
        return personService.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        personService.deleteById(id);
    }

    @PutMapping("/")
    public void update(@RequestBody Person person){
        personService.save(person);
    }

}
