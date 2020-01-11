package org.hello.oauth2.authorities.SpringSecurityOAuth2Authorities.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello Docker World!";
    }
}
