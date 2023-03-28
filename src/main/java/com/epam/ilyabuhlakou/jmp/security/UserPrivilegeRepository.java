package com.epam.ilyabuhlakou.jmp.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPrivilegeRepository extends JpaRepository<UserPrivilege, Long> {
    UserPrivilege findByName(String name);
}
