package com.test.concepts.learn.spring.dependency_injection.exercise001;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Component
public class EmployServiceImpl implements EmployService{

    private String name;
    private int age;
    private String profession;

    @Override
    public void working() {
        System.out.println("working in Employ Service");
    }

    @Override
    public StringBuilder getPersonalInformation() {
        StringBuilder personalInformation = new StringBuilder();
        return personalInformation.append("Name : ").append(this.getName()).append(" \n")
                .append("Age : ").append(this.getAge()).append(" \n")
                .append("Profession : ").append(this.getProfession()).append(" \n");
    }

}