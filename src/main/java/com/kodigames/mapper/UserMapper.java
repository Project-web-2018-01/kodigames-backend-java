package com.kodigames.mapper;

import com.kodigames.domain.User;
import com.kodigames.domain.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto mapToUserDto(final User user){
        return new UserDto(user.getUserId(),
                user.getName(),
                user.getSurname(),
                user.getLogin(),
                user.getPassword());
    }

    public User mapToUser(final UserDto userDto){
        return new User(userDto.getUserId(),
                userDto.getName(),
                userDto.getSurname(),
                userDto.getLogin(),
                userDto.getPassword());
    }
}
