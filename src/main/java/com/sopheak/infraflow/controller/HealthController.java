package com.sopheak.infraflow.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class HealthController {
    @GetMapping("/api/health")
    public Map<String , String > health(){
        return Map.of(
             "status", "UP",
             "service", "infraflow"
        );
    }

    @GetMapping("/api/info")
    public Map<String, String> info() {
        return Map.of(
                "service", "InfraFlow",
                "version", "1.0.0"
        );
    }
    
}
