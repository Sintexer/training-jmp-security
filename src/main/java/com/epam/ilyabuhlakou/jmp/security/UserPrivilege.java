package com.epam.ilyabuhlakou.jmp.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "privilegess")
public class UserPrivilege {
    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Collection<UserRole> roles;

    public UserPrivilege(String name) {
        this.name = name;
    }
}
