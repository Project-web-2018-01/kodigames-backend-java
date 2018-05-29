package com.kodigames.service;

import com.kodigames.domain.User;
import com.kodigames.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDbService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long userId) {
        return userRepository.findById(userId);
    }

    public User updateUser(Long userId, User user) {
        return userRepository.update(userId, user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
