package com.test.concepts.learn.spring;

import com.test.concepts.learn.spring.dependency_injection.exercise001.EmployService;
import com.test.concepts.learn.spring.dependency_injection.exercise001.EmployServiceImpl;
import com.test.concepts.learn.spring.dependency_injection.exercise001.Employe;
import com.test.concepts.learn.spring.dependency_injection.exercise002.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.0.5
 * @since 21.0.0 2024-02-07
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		System.out.println("--------------------Dependency Injection in Constructor---------------------------");
		// Dependency injection from Constructor
		EmployService employService = new EmployServiceImpl("Alex", 27, "Software Engineer");
        Employe employe = new Employe(employService); // here
		employe.getEmployeService().working();
		System.out.println(employe.getEmployeService().getPersonalInformation().toString());

		System.out.println("--------------------Dependency Injection in Fields---------------------------");
		// Dependency injection from Fields
		MessengerService messengerService = new MessengerServiceImpl();
		AuthorizationService authorizationService = new AuthorizationServiceImpl(UUID.randomUUID());
		EncryptService encryptService = new EncryptServiceImpl();
		User user = new User(authorizationService, encryptService, messengerService);

		UUID key = user.getAuthorizationService().generateKey();
		System.out.println(key);
		user.getAuthorizationService().showKey();
		System.out.println(user.getAuthorizationService().validateAuth(key));

		String password = user.getEncryptService().encrypt("Hacker99net001<>");
		System.out.println(password);
		System.out.println(user.getEncryptService().decrypt(password));

		user.getMessengerService().send("Hello, Alex who are you", "Meta", "Alex");
		user.getMessengerService().delete();
		user.getMessengerService().update();
	}
}
