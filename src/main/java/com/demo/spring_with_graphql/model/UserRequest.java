package com.demo.spring_with_graphql.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UserRequest {

    private String username;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    public UserRequest() {
    }

    public UserRequest(String username, String email, Role role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
