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
 * @version v0.1.6
 * @since 21.0.0 2024-07-27
 */
@Data
@NoArgsConstructor
@Component
public class BdImpl {

    //Injections by Method
    @Autowired
    public void instanceMySql(@Qualifier("MySQL") MySql mySql) {
        System.out.println(mySql.name());
        System.out.println(mySql.description());
        System.out.println(mySql.use());
    }

    @Autowired
    public void instancePostgreSql(@Qualifier("PostgreSQL")PostgreSql postgreSql){
        System.out.println(postgreSql.name());
        System.out.println(postgreSql.description());
        System.out.println(postgreSql.use());
    }

    @Autowired
    public void instanceElasticSearch(@Qualifier("Elasticsearch")ElasticSearch elasticSearch){
        System.out.println(elasticSearch.name());
        System.out.println(elasticSearch.description());
        System.out.println(elasticSearch.use());
    }

}
