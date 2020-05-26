package io.ace.microservices.edgeservice.model;


import lombok.Data;

@Data
public class User {
    public Long id;
    public String name;
    private String address;

}
