package com.epam.ilyabuhlakou.jmp.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomUserRepository extends JpaRepository<CustomUser, Long> {
    CustomUser findByEmail(String email);
}
