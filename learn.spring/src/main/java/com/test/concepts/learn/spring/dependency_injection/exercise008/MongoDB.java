package com.test.concepts.learn.spring.dependency_injection.exercise008;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.9
 * @since 21.0.0 2024-08-28
 */
@Data
@AllArgsConstructor
@Component("MongoDB")
public class MongoDB implements BDSystem{

    @Override
    public String name() {
        return "MongoDB";
    }

    @Override
    public String description() {
        return "MongoDB es una base de datos NoSQL orientada a documentos, diseñada para almacenar datos de manera " +
                "flexible y escalable. A diferencia de las bases de datos relacionales tradicionales " +
                "(como MySQL o PostgreSQL), que utilizan tablas y filas para organizar la información," +
                "MongoDB utiliza una estructura basada en documentos JSON (BSON internamente), " +
                "lo que permite un esquema más dinámico y adaptable.";
    }

    @Override
    public String use() {
        return "MongoDB es ampliamente utilizado en el desarrollo de aplicaciones web y móviles, gestión de contenido, " +
                "y catálogos de productos debido a su flexibilidad en el manejo de datos dinámicos y estructuras " +
                "variables. También es ideal para big data y análisis en tiempo real, así como para aplicaciones " +
                "de Internet de las Cosas (IoT), gracias a su capacidad para gestionar grandes volúmenes de datos " +
                "no estructurados y semi-estructurados.";
    }
}
