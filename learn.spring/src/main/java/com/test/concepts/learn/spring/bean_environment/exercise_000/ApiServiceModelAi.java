package com.test.concepts.learn.spring.bean_environment.exercise_000;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;

/**
 * Learn Bean Environment
 *
 * @author Alex T.H.
 * @version v0.1.8
 * @since 21.0.0 2024-08-20
 */
@Service
public class ApiServiceModelAi {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Groq groq;

    private final String apiUrl = "https://api.groq.com/openai/v1/chat/completions";
    private String apiKey;

    public String useModel(String prompt) throws JsonProcessingException {
        return this.sendRequest(prompt);
    }

    public String sendRequest(String prompt) throws JsonProcessingException {

        apiKey = groq.getGroqKey();
        HttpHeaders headers = new HttpHeaders();
//        System.out.println("API KEY GROQ =>" + apiKey);
        headers.set("Authorization", "Bearer " + apiKey);
        headers.set("Content-Type", "application/json");

        ObjectMapper objectMapper = new ObjectMapper();
        Message message = new Message("user", prompt);
        RequestBody requestBody = new RequestBody(Collections.singletonList(message),  "llama3-8b-8192");

        String jsonBody = objectMapper.writeValueAsString(requestBody);

        HttpEntity<String> requestEntity = new HttpEntity<>(jsonBody, headers);

        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, String.class);

       if(response.getStatusCode() == HttpStatus.OK){
           return response.getBody();
       }else{
           throw new RuntimeException("Failed the MODEL AI");
       }

    }

    public String processingPrompt(String prompt) throws IOException {
        String response = this.useModel(prompt);
        ObjectMapper objectMapper = new ObjectMapper();
        ChatCompletion completeResponse = objectMapper.readValue(response, ChatCompletion.class);
        return completeResponse.getChoices().getFirst().getMessage().getContent();
    }

}
