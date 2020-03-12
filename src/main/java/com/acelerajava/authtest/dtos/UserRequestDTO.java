package com.acelerajava.authtest.dtos;

import com.acelerajava.authtest.domain.User;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String email;
    private String password;

    public UserRequestDTO() {}

    public UserRequestDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
