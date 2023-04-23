package dev.api.mongodb.model;

import dev.api.mongodb.repository.PersonRepository;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ether")
@Data
public class Person {

    @Id
    private String id;
    private String name;
    private String lastname;
    private String email;
    private Integer age;

}
