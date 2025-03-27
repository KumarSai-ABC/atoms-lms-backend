package com.kumarsai.Spring_Boot_Project.service;

import com.kumarsai.Spring_Boot_Project.model.User;
import com.kumarsai.Spring_Boot_Project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }
}