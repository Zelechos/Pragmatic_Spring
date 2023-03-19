package com.app.faas;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PersonEntity {
    private String name;
    private List<String> technologies;
}
