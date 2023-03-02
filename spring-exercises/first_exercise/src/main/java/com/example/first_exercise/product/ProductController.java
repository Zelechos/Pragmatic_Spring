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

//    public List<Product> products = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/product")
    public List<Product> product(@RequestParam(value="name", defaultValue = "undefinedNameOfSoftware") String name) throws IOException {
        return new Project().createProject(name,counter);
    }

//    @GetMapping("/product")
//    public Product getOneProduct(@RequestParam(value="id", defaultValue = "0") long id){
//        return this.getProduct(id);
//    }




}
