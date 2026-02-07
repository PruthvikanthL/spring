package com.springsecurity_learning.basic_authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessCotroller {
    @RequestMapping("/pub")
    public String openEvery(){
        return "This is public access everyone use it";
    }
    @RequestMapping("/admin")
    public String onlyAdmin(){
        return "This is admin block i think your admin with valid user can access this";
    }
}
