package com.epam.ilyabuhlakou.jmp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorize -> authorize
                        .antMatchers("/about").permitAll()
                        .antMatchers(HttpMethod.POST, "/register").hasAnyAuthority("view:admin")
                        .antMatchers("/info*").hasAnyAuthority("view:info")
                        .antMatchers("/admin", "/admin/**").hasAnyAuthority("view:admin")
                                .anyRequest().authenticated())
                .csrf().disable()
                .httpBasic()
                .and()
                .formLogin();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
