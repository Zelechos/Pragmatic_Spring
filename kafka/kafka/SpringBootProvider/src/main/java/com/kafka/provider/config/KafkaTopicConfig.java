package com.kafka.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic generateTopic(){


        Map<String,String> configurations = new HashMap<>();
        /**
         *
         * CLEANUP_POLICY_DELETE:  sirve para borrar el mensaje
         * CLEANUP_POLICY_COMPACT:  sirve para mantener el mensaje mas reciente
         * RETENTION_MS_CONFIG: sirve para saber cuanto tiempo se va a retener o persistir el mensaje (milisegundos)
         * por defecto viene en -1 que significa que no se borra nunca
         * SEGMENT_BYTES_CONFIG: sirve para especificar el tamaño maximo de cada elementos (en bytes) por defecto 1GB
         * MAX_MESSAGE_BYTES_CONFIG: sirve para definir cual sera el peso maximo de cada mensaje por defecto 1MB
         *
         */
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1973741825");
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1973741825");

        return TopicBuilder
                .name("hackerSystem")
                .partitions(2)
                .replicas(3)
                .configs(configurations)
                .build();
    }

}
