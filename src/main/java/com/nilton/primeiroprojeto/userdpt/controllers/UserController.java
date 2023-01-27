package com.nilton.primeiroprojeto.userdpt.controllers;

import com.nilton.primeiroprojeto.userdpt.entities.User;
import com.nilton.primeiroprojeto.userdpt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
