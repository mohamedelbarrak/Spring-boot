package com.uca.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class url {
    @Value("http://localhost:8080")//L'app Demo
    private String helloServiceUrl;

    @GetMapping("/demo2-response")
    public String response() {
        RestTemplate restTemplate = new RestTemplate();
        //return restTemplate.getForObject(helloServiceUrl + "/hello", String.class);//seulement get

        //restTemplate.exchange()//pour les get post put del
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                helloServiceUrl + "/demo-hello",
                HttpMethod.GET,
                null,
                String.class);

        // Accéder au corps de la réponse
        return responseEntity.getBody();
    }
}
