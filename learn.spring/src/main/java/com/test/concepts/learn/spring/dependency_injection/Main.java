package com.test.concepts.learn.spring.dependency_injection;

import com.test.concepts.learn.spring.dependency_injection.exercise001.EmployService;
import com.test.concepts.learn.spring.dependency_injection.exercise001.EmployServiceImpl;
import com.test.concepts.learn.spring.dependency_injection.exercise001.Employe;
import com.test.concepts.learn.spring.dependency_injection.exercise002.*;
import com.test.concepts.learn.spring.dependency_injection.exercise003.Programmer;
import com.test.concepts.learn.spring.dependency_injection.exercise003.UserParallel;
import com.test.concepts.learn.spring.dependency_injection.exercise003.Work;
import com.test.concepts.learn.spring.dependency_injection.exercise004.Cryptographer;
import com.test.concepts.learn.spring.dependency_injection.exercise004.HackerWork;
import com.test.concepts.learn.spring.dependency_injection.exercise004.Skills;
import com.test.concepts.learn.spring.dependency_injection.exercise004.SoftwareEngineer;
import com.test.concepts.learn.spring.dependency_injection.exercise005.AreasOfIA;
import com.test.concepts.learn.spring.dependency_injection.exercise005.ComputerVision;
import com.test.concepts.learn.spring.dependency_injection.exercise005.NaturalLanguageProcessing;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.1
 * @since 21.0.0 2024-07-16
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("--------------------Dependency Injection in Constructor---------------------------");
        // Recommended use @Autowired annotation
        // Dependency injection from Constructor
        EmployService employService = new EmployServiceImpl("Alex", 27, "Software Engineer");
        Employe employe = new Employe(employService); // here
        employe.getEmployeService().working();
        System.out.println(employe.getEmployeService().getPersonalInformation().toString());
        System.out.println(employe.getEmployeService().generatePDfBase64());

        System.out.println("--------------------Dependency Injection in Fields---------------------------");
        // Dependency injection from Fields
        // NOT Recommended use @Autowired annotation !
        MessengerService messengerService = new MessengerServiceImpl();
        AuthorizationService authorizationService = new AuthorizationServiceImpl(UUID.randomUUID());
        EncryptService encryptService = new EncryptServiceImpl();
        DocumentService documentService = new DocumentServiceImpl();
        User user = new User(authorizationService, encryptService, messengerService, documentService);

        UUID key = user.getAuthorizationService().generateKey();
        System.out.println(key);
        user.getAuthorizationService().showKey();
        System.out.println(user.getAuthorizationService().validateAuth(key));

        String password = user.getEncryptService().encrypt("Hacker99net001<>");
        System.out.println("Encrypted Password => " + password);
        System.out.println("Decrypted Password => " + user.getEncryptService().decrypt(password));

        user.getMessengerService().send("Hello, Alex who are you", "Meta", "Alex");
        user.getMessengerService().delete();
        user.getMessengerService().update();

        System.out.println(user.getDocumentService().generatePdfDocument());
        System.out.println(user.getDocumentService().generatePdfBase64Document());
        System.out.println(user.getDocumentService().generateExcelDocument());
        System.out.println(user.getDocumentService().generateCsvBase64Document());
        System.out.println(user.getDocumentService().generateCsvDocument());
        System.out.println(user.getDocumentService().generateExcelBase64Document());

        System.out.println("--------------------Dependency Injection in Methods ---------------------------");
        // Dependency injection from Methods
        // NOT Recommended use @Autowired annotation !
        Work work = new Programmer(4);
        UserParallel userParallel = new UserParallel();
        userParallel.showWorker(work);

        System.out.println("--------------------Dependency Injection in Setters ---------------------------");
        // Dependency injection from Setters
        // Recommended use @Autowired annotation !
        Skills skills001 = new Cryptographer();
        Skills skills002 = new HackerWork();
        SoftwareEngineer softwareEngineer001 = new SoftwareEngineer();
        SoftwareEngineer softwareEngineer002 = new SoftwareEngineer();
        softwareEngineer001.setSoftwareEngineer(skills001);
        softwareEngineer002.injectSoftwareEngineer(skills002);
        System.out.println("softwareEngineer001 ==> " + softwareEngineer001.getSkills().toString());
        System.out.println("softwareEngineer002 ==> " + softwareEngineer002.getSkills().toString());

        System.out.println("-----------Dependency Injection in Constructor & Setter Method use @Qualifier Annotation -----------");
        // Use @Qualifier Annotation to define a Bean Inject
        NaturalLanguageProcessing nlp = new NaturalLanguageProcessing(NaturalLanguageProcessing.class.getSimpleName(), "NLP", LocalDateTime.now());
        ComputerVision cv = new ComputerVision(ComputerVision.class.getSimpleName(), "CV", LocalDateTime.now());

        AreasOfIA areas = new AreasOfIA(nlp);// DI for Contructor
        areas.setComputerVision(cv);// DI for Setter method

        System.out.println(areas.name());
        System.out.println(areas.getNaturalLanguageProcessing().getName());
        System.out.println(areas.getComputerVision().name());

        Main.hell();

    }

    static final String hell() {
        return "hello from final method";
    }
}
