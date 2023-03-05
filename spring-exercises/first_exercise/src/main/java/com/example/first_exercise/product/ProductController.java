package com.example.first_exercise.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProductController {

    private final AtomicLong counter = new AtomicLong();

    private final List<Product> products = new ArrayList<>();

    @GetMapping("/product")
    public List<Product> product(
            @RequestParam(value = "name", defaultValue = "undefinedNameOfSoftware")
            String name, String softwareType, double price, String timeOfDevelopment
    ) throws IOException {
        return new Project().createProject(name, softwareType, price, timeOfDevelopment, counter);
    }

    @GetMapping("/developers")
    public List<String> getAllDevelopers(@RequestParam(value="name", defaultValue = "none")String name) throws IOException {
        return new Project().getDevelopers();
    }


    @GetMapping("/technologies")
    public List<String> getAllTechnologies(@RequestParam(value="name", defaultValue = "none")String name) {
        return new Project().getTechnologies();
    }


}
