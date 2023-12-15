package com.securityEx.securityExProject.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecurityController {




    @GetMapping("/")
    public String Hello(){
        return null;
    }


}
