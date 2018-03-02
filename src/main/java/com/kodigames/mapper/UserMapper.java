package com.kodigames.mapper;

import com.kodigames.domain.User;
import com.kodigames.domain.UserDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class UserMapper {

    public UserDto mapToUserDto(final User user) {
        return new UserDto(user.getId(),
                user.getFirstName(),
                user.getSurname(),
                user.getLogin(),
                user.getPassword());
    }

    public User mapToUser(final UserDto userDto) {
        return new User(userDto.getId(),
                userDto.getFirstName(),
                userDto.getSurname(),
                userDto.getLogin(),
                userDto.getPassword());
    }

    public List<GameDto> mapToGameDtoList(final List<Game> games) {
        return new games.strem()
                .map(g -> new GameDto(g.getId(), g.getName(), g.getDesc()))
                .collect(Collectors.toList());
    }
}
