package com.epam.ilyabuhlakou.jmp.security;

import lombok.Getter;

@Getter
public class EmailExistsException extends RuntimeException {
    private final String username;

    public EmailExistsException(String username) {
        this.username = username;
    }
}
