package com.app.faas;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Function;

@Component
public class FaasFunction implements Function<PersonEntity, Map<String, Object>> {

    @Override
    public Map<String, Object> apply(PersonEntity personEntity) {
        return Map.of("Hello ", personEntity.getName(), "numItems", personEntity.getTechnologies().size());
    }
}
