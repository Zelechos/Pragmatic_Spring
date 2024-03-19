package com.test.concepts.learn.spring.dependency_injection.exercise005;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Learn Dependency Injection use Annotation @Qualifier
 *
 * @author Alex T.H.
 * @version v0.1.0
 * @since 21.0.0 2024-03-19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class AreasOfIA implements IA{

    private NaturalLanguageProcessing naturalLanguageProcessing;
    private ComputerVision computerVision;

    public AreasOfIA(@Qualifier("NaturalLanguageProcessing") NaturalLanguageProcessing naturalLanguageProcessing){
        this.naturalLanguageProcessing = naturalLanguageProcessing;
    }
    @Override
    public AreasOfIA getAreasOfIA() {
        return this;
    }

    @Override
    public int yearsOfKnowledge() {
        return 1;
    }

    @Override
    public String name() {
        return "IA Inteligencia Artificial";
    }

    public void setComputerVision(@Qualifier("ComputerVision") ComputerVision computerVision){
        this.computerVision = computerVision;
    }
}
