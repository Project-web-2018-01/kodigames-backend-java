package com.kodigames.controller;

import com.kodigames.domain.UserDto;
import com.kodigames.mapper.UserMapper;
import com.kodigames.service.UserDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @Autowired
    private UserDbService userDbService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping
    public void createUser(@RequestBody UserDto userDto){
    }
}
