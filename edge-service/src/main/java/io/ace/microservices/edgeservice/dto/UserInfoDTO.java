package io.ace.microservices.edgeservice.dto;

import io.ace.microservices.edgeservice.model.User;
import lombok.Data;

import java.util.List;

@Data
public class UserInfoDTO {
    private List<User> users;
}
