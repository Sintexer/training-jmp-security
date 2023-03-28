package com.epam.ilyabuhlakou.jmp.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserRegistrationService {

    private final UserRoleService userRoleService;
    private final CustomUserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public CustomUserRegistrationService(UserRoleService userRoleService, CustomUserRepository repository, PasswordEncoder passwordEncoder) {
        this.userRoleService = userRoleService;
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public CustomUser registerUser(CustomUser user) {
        if (repository.findByEmail(user.getEmail()) != null) {
            throw new EmailExistsException(user.getEmail());
        }
        // BCrypt encoder is being used, so salt is applied automatically
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(userRoles());
        user.setId(null);
        return repository.save(user);
    }

    private List<UserRole> userRoles() {
        return List.of(userRoleService.getRoleByName(RoleName.USER.getRoleName()));
    }
}
