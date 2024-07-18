package com.test.concepts.learn.spring.dependency_injection.exercise007;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Learn Dependency Injection whit @Qualifier
 *
 * @author Alex T.H.
 * @version v0.1.3
 * @since 21.0.0 2024-07-18
 */
@Data
@NoArgsConstructor
@Service
public class SO {

    private SOForHacking so;

    // Field Injection
    @Autowired
    @Qualifier("Parrot")
    public SOForHacking so_001;

    // Constructor Injection
    @Autowired
    public SO(@Qualifier("Kali") SOForHacking so){
        this.so = so ;
    }

    public void showName(){
        System.out.println(so.name());
    }

    public void showDescription(){
        System.out.println(so.description());
    }

    // Setter Injection
    @Autowired
    @Qualifier("BlackArch")
    public void setSo(SOForHacking so){
       this.so = so;
    }

    // Method Injection
    @Autowired
    @Qualifier("Security")
    public void showSecuritySOInfo(SOForHacking so){
        System.out.println("[" + so.name() + "] => " + so.description());
    }

}
