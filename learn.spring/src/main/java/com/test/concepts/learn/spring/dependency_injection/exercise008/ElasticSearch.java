package com.test.concepts.learn.spring.dependency_injection.exercise008;

import lombok.Data;
import lombok.NoArgsConstructor;
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
@Component("Elasticsearch")
public class ElasticSearch implements BDSystem{

    @Override
    public String name() {
        return "Elasticsearch";
    }

    @Override
    public String description() {
        return "Elasticsearch es un motor de búsqueda y análisis de datos distribuido, basado en Apache Lucene. " +
                "Es conocido por sus capacidades de búsqueda en tiempo real y análisis de grandes volúmenes de datos.";
    }

    @Override
    public String use() {
        return "Utilizado para búsqueda de texto completo, análisis de logs y análisis de datos en tiempo real.";
    }
}
