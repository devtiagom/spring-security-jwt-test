package com.acelerajava.authtest.dtos;

import com.acelerajava.authtest.domain.User;
import com.acelerajava.authtest.domain.enums.UserProfile;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

        private Long id;
        private String name;
        private String email;
        private Set<UserProfile> profiles = new HashSet<>();

    public UserResponseDTO() {}

    public UserResponseDTO(User user) {
            this.id = user.getId();
            this.name = user.getName();
            this.email = user.getEmail();
            this.profiles = user.getProfiles();
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<UserProfile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<UserProfile> profiles) {
        this.profiles = profiles;
    }
}
