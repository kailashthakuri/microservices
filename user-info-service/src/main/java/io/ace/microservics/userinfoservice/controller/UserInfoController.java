package io.ace.microservics.userinfoservice.controller;

import io.ace.microservics.userinfoservice.dto.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserInfoController {

    @GetMapping("/userinfos")
    public UserInfoDTO getUserInfos() {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        return null;
    }

}
