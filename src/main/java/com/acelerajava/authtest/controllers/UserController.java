package com.acelerajava.authtest.controllers;

import com.acelerajava.authtest.dtos.UserResponseDTO;
import com.acelerajava.authtest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserResponseDTO>> getAll() {
        List<UserResponseDTO> users = userService
                .getAll()
                .stream()
                .map(UserResponseDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(users);
    }
}
