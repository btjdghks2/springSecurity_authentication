package com.securityEx.securityExProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class SecurityController {

    @GetMapping("/")
    public String Hello(){
        return null;
    }
}
