package com.epam.ilyabuhlakou.jmp.security;

import lombok.Getter;

@Getter
public enum RoleName {
    USER("USER_ROLE"),
    ADMIN("AMIN_ROLE");

    private final String roleName;
    RoleName(String roleName) {
        this.roleName = roleName;
    }
}
