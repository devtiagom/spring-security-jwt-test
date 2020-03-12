package com.acelerajava.authtest.services;

import com.acelerajava.authtest.domain.User;
import com.acelerajava.authtest.dtos.UserRequestDTO;
import com.acelerajava.authtest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    public User save(UserRequestDTO userRequestDTO) {
        return userRepository.save(fromDTO(userRequestDTO));
    }

    private User fromDTO(UserRequestDTO userRequestDTO){
        return new User(null, userRequestDTO.getName(), userRequestDTO.getEmail(), userRequestDTO.getPassword());
    }
}
