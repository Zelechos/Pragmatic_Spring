package com.example.first_exercise.product;

import java.util.List;

public record Product(
        long id,
        String name,
        double price,
        String softwareType,
        String timeOfDevelopment,
        List<String> tecnologies,
        List<String> developers) {
}
