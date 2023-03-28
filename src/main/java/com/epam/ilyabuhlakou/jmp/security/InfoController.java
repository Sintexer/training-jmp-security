package com.epam.ilyabuhlakou.jmp.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class InfoController {

    CustomUserRegistrationService registrationService;

    public InfoController(CustomUserRegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/info")
    public String getInfo() {
        return "MVC application Some useful info";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "About what?";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "I see your power Mr. Admin";
    }

    @PostMapping("/register")
    public CustomUser register(@RequestBody CustomUser user) {
        return registrationService.registerUser(user);
    }
}
