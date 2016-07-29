package com.rockysingh.cache.service;

import com.rockysingh.cache.domain.User;
import com.rockysingh.cache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        return userRepository.findById(id);
    }

    public User save(User user) {
        userRepository.save(user);
        return userRepository.findById(user.getId());
    }

    public void delete(User user) {
        userRepository.delete(user);
    }


}
