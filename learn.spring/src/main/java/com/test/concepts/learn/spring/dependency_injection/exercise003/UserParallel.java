package com.test.concepts.learn.spring.dependency_injection.exercise003;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.9
 * @since 21.0.0 2024-03-11
 */
@Data
@NoArgsConstructor
public class UserParallel {

    private Work work;
    private DataSource data;

    @Autowired
    public void showWorker(Work work) {
        System.out.println("Courses => " + work.courses());
        System.out.println("Programming Languages => " + work.programmingLanguages());
        System.out.println("Years of Experience => " + work.yearOfExperience());
    }

    @Autowired
    public String showDataSource(DataSource data){
       return data.stateOfData();
    }
}
