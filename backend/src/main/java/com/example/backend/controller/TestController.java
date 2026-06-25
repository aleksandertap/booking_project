package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public Map<String, String> getHelloMessage() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello from the Spring Boot Backend!");
        return response;
    }
}