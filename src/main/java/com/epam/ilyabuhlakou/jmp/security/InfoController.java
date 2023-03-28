package com.epam.ilyabuhlakou.jmp.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/info")
@RestController
public class InfoController {

    @GetMapping
    public String getInfo() {
        return "MVC application Some useful info";
    }
}
