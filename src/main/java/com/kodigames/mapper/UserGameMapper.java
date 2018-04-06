package com.kodigames.mapper;


import com.kodigames.domain.UserGame;
import com.kodigames.domain.UserGameDto;

public class UserGameMapper {

    public UserGameDto mapToUserGameDto(final UserGame userGame) {
        return new UserGameDto(userGame.getId(),
                userGame.getUser (),
                userGame.getGame (),
                userGame.getRate());
    }

    public UserGame mapToUserGame(final UserGameDto userGameDto) {
        return new UserGame(userGameDto.getId(),
                userGameDto.getUser (),
                userGameDto.getGame (),
                userGameDto.getRate());
    }

}
