package com.example.Login.Controller;

import com.example.Login.Model.user;
import com.example.Login.Service.userService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class userController {
    final String USER_NAME = "name";
    final String USER_EMAIL = "email";
    final String USER_PASSWORD="password";
    @Autowired
    userService userService;

    @GetMapping(value = "/get")
    public ArrayList<user> getUser() {
        return userService.getUser();
    }
    @PostMapping (value = "/post")
    public String setUser(String json){
        if (json != null && !json.isEmpty()) {
            return userService.setUser(setT(json,USER_NAME),setT(json,USER_EMAIL),setT(json,USER_PASSWORD)).toString();
        }else {
            return null;
        }
    }
    private String setT (String json, String cns){
        try {
            Map<String, Object> params = new ObjectMapper().readerFor(Map.class).readValue(json);
            return (params.containsKey(cns) && params.get(cns) != null && !params.get(cns).
                    toString().isEmpty()) ? params.get(cns).toString() : null;
        } catch (Exception e) {
            System.out.println("error");
        }
        return null;
    };
}
