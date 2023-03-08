package com.example.first_exercise.product;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


public class Project {

    private final List<String> developers = new ArrayList<>();
    private final List<Product> products = new ArrayList<>();
    private List<String> technologies;

    public List<Product> createProject(String name, String softwareType, double price, String timeOfDevelopment, AtomicLong counter) throws IOException {
        var devs = randomList(this.definedDevelopers());
        var techs = randomList(this.definedTechnologies());
        var product = new Product(counter.incrementAndGet(), name, price, softwareType, timeOfDevelopment, techs, devs);
        products.add(product);
        return products;
    }

    public List<String> getDevelopers() throws IOException {
        return this.definedDevelopers();
    }

    public List<String> getTechnologies() {
        return this.definedTechnologies();
    }

    public List<String> definedTechnologies() {
        technologies = new ArrayList<>();
        technologies.add(Technologies.REACT_JS.name());
        technologies.add(Technologies.JAVASCRIPT.name());
        technologies.add(Technologies.JAVA_SE.name());
        technologies.add(Technologies.SPRING.name());
        technologies.add(Technologies.GIT.name());
        technologies.add(Technologies.GITHUB.name());
        technologies.add(Technologies.JAVA_EE.name());
        technologies.add(Technologies.PYTHON.name());
        technologies.add(Technologies.PYTORCH.name());
        technologies.add(Technologies.TENSORFLOW.name());
        return technologies;
    }


    public List<String> definedDevelopers() throws IOException {
        String archCSV = "L:\\Repositorios\\Pragmatic_Spring\\spring-exercises\\first_exercise\\src\\main\\java\\com\\example\\first_exercise\\product\\developers.csv";
        CSVReader csvReader = new CSVReader(new FileReader(archCSV));
        List<String[]> textList = csvReader.readAll();
        for (int i = 1; i < textList.size(); i++) {
            var developer = textList.get(i);
            developers.add(developer[0]);
        }
        csvReader.close();
        return developers;
    }


    public List<String> randomList(List<String> listOfData) {
        for (var i = listOfData.size(); i > 4; i--) {
            var randomIndex = (int) (Math.random() * listOfData.size() + 0);
            if (randomIndex < listOfData.size()) listOfData.remove(randomIndex);
        }
        return listOfData;
    }

}
