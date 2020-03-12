package com.acelerajava.authtest.services;

import com.acelerajava.authtest.domain.User;
import com.acelerajava.authtest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
