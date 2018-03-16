package com.kodigames.mapper;


import com.kodigames.domain.UserGame;
import com.kodigames.domain.UserGameDto;

public class UserGameMapper {

    public UserGameDto mapToUserGameDto(final UserGame userGame) {
        return new UserGameDto(userGame.getId(),
                userGame.getUserId(),
                userGame.getGameId(),
                userGame.getRate());
    }

    public UserGame mapToUserGame(final UserGameDto userGamesDto) {
        return new UserGame(userGamesDto.getId(),
                userGamesDto.getUserId(),
                userGamesDto.getGameId(),
                userGamesDto.getRate());
    }

}
