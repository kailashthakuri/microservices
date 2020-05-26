package io.ace.microservices.edgeservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ConfigClientTestController {

    @Value("${my.greeting:default greeting}")
    private String greeting;

    @GetMapping
    public String test() {
        return greeting;
    }

}
