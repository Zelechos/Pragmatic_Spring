package com.example.first_exercise.product;
import au.com.bytecode.opencsv.CSVReader;
import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


public class Project {

    private List<String> technologies;
    private List<String> developers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public List<Product> createProject(String name, AtomicLong counter) throws IOException {
        List<String> devs = this.definedDevelopers();
        Product product = new Product(
                counter.incrementAndGet(), name, 234.34, "Saas",
                "cinco meses", this.definedTechnologies(),devs);

        Product product1 = new Product(
                counter.incrementAndGet(), name, 234.34, "Saas",
                "cinco meses", this.definedTechnologies(), devs);

        Product product2 = new Product(
                counter.incrementAndGet(), name, 234.34, "Saas",
                "cinco meses", this.definedTechnologies(), devs);

        products.add(product);
        products.add(product1);
        products.add(product2);

        return products;
    }

    public Product getProject(long id){
        return products.get((int)id);
    }


    public List<String> definedTechnologies(){
        technologies = new ArrayList<>();
        technologies.add(Technologies.REACT_JS.name());
        technologies.add(Technologies.JAVA_SE.name());
        technologies.add(Technologies.SPRING.name());
        technologies.add(Technologies.GIT.name());
        return technologies;
    }


    public List<String> definedDevelopers() throws IOException {
        String archCSV = "L:\\Repositorios\\Pragmatic_Spring\\spring-exercises\\first_exercise\\src\\main\\java\\com\\example\\first_exercise\\product\\developers.csv";
        CSVReader csvReader = new CSVReader(new FileReader(archCSV));
        List<String[]> d = new ArrayList<>();
        d = csvReader.readAll();
        System.out.println(d.size());
        for (int i = 0; i < d.size(); i++) {
            developers.add(Arrays.toString(d.get(i)));
        }
        csvReader.close();
        return developers;
    }

}
