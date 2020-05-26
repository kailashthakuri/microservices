package io.ace.microservices.edgeservice.controller;


import io.ace.microservices.edgeservice.dto.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {


    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/")
    public Collection<UserInfoDTO> getAllUser() {
        restTemplate.getForObject("http://user-info-service/")
    }


}
