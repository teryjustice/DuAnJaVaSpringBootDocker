package com.example.Docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "<h1>Docker Spring Boot Application is Running!</h1><p>Deploy thành công lên DevOps Classroom.</p>";
    }
}
