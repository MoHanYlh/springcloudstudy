package com.mohan.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mohan.cloud.dao.UserRepository;
import com.mohan.cloud.dto.User;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        
        User findOne = userRepository.findOne(id);
        return findOne;
    }
}
