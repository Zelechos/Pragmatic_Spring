package com.test.concepts.learn.spring.dependency_injection.exercise008;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.2.0
 * @since 21.0.0 2024-08-28
 */
@Data
@NoArgsConstructor
@Component
public class BdImpl {

    private BDSystem bdSystem;

    //Injections by Method
    @Autowired
    public BDSystem instanceMySql(@Qualifier("MySQL") BDSystem bdSystem) {
        return bdSystem;
    }

    @Autowired
    public BDSystem instancePostgreSql(@Qualifier("PostgreSQL") BDSystem bdSystem) {
        return bdSystem;
    }

    @Autowired
    public BDSystem instanceElasticSearch(@Qualifier("Elasticsearch") BDSystem bdSystem) {
        return bdSystem;
    }

    @Autowired
    @Qualifier("MongoDB") // another way to use @Qualifier annotation
    public BDSystem instanceMongoDB(BDSystem bdSystem) {
        return bdSystem;
    }

    public void showDBInfo(BDSystem bdSystem) {
        System.out.println("-------------------------\n" +
                "Name=" + bdSystem.name() + "\n" +
                "Description=" + bdSystem.description() + "\n" +
                "Use=" + bdSystem.use() + "\n" +
                "-------------------------");
    }
}
