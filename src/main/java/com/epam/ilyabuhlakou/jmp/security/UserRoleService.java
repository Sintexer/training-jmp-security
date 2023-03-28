package com.epam.ilyabuhlakou.jmp.security;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class UserRoleService {

    private final UserRoleRepository roleRepository;
    private final UserPrivilegeRepository privilegeRepository;

    public UserRoleService(UserRoleRepository roleRepository, UserPrivilegeRepository privilegeRepository) {
        this.roleRepository = roleRepository;
        this.privilegeRepository = privilegeRepository;
    }

    public UserRole getRoleByName(String roleName) {
        return roleRepository.findByName(roleName);
    }

//    @Transactional
//    public UserPrivilege createPrivilegeIfNotFound(String name) {
//
//        UserPrivilege privilege = privilegeRepository.findByName(name);
//        if (privilege == null) {
//            privilege = new UserPrivilege(name);
//            privilegeRepository.save(privilege);
//        }
//        return privilege;
//    }
//
//    @Transactional
//    private UserRole createRoleIfNotFound(String name, Collection<UserPrivilege> privileges) {
//
//        UserRole role = roleRepository.findByName(name);
//        if (role == null) {
//            role = new UserRole(name, privileges);
//            roleRepository.save(role);
//        }
//        return role;
//    }
}
