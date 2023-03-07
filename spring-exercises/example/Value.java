package com.example.second_exercise.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Value(Long id, String quote) {
}
