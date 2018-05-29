package com.kodigames.service;

import com.kodigames.domain.UserDto;
import com.kodigames.repository.UserRepository;
import com.kodigames.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDbService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public Optional<User> getUser(Long userId) {
        return userRepository.findById(userId);
    }

    public User updateUser(Long userId, UserDto userDto) {
        return userRepository.update(userId, userDto);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
