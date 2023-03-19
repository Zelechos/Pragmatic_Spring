package com.app.faas;

import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Component
public class FaasController {

    //    Creamos una function que devuelve un Objeto de Tipo Function
    @Bean
    public Function<String, String> function() {
        return input -> {
            return "Hello\t" + input;
        };
    }

    //    Creamos un consumidores o consumers son como una funcion que no devuelven nada
    @Bean
    public Consumer<String> consume() {
        return input -> {
            System.out.println("Consumidor sin salida\t" + input);
        };
    }

    //    Creamos un suppliers son como una function que devuelve elementos pero no pueden recibiri nada
    @Bean
    public Supplier<String> supply() {
        return () -> {
            return "Salida sin consumir nada";
        };
    }

    @Bean
    public Function<Map<String, Object>, String> mapJson() {
        return input -> {
            return "Hola:\t" + input.get("name") + " " + ((List<Object>) input.get("languages")).size();
        };
    }

    @Bean
    public Function<PersonEntity, StringBuilder> mapObject() {
        return input -> {
            StringBuilder response = new StringBuilder("Hello ");
            response.append(input.getName());
            response.append(input.getTechnologies().toString());
            return response;
        };
    }

    @Bean
    public Function<Message<PersonEntity>, String> mapMessage() {
        return input -> {
            return "Header : " + input.getHeaders() + "\nPayload: " + input.getPayload() + "\n";
        };
    }
}
