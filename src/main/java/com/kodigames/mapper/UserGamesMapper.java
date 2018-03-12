package com.kodigames.mapper;

import com.kodigames.domain.UserGames;
import com.kodigames.domain.UserGamesDto;

public class UserGamesMapper {

    public UserGamesDto mapToUserGamesDto(final UserGames userGames){
        return new UserGamesDto(userGames.getId(),
                userGames.getUser_id(),
                userGames.getGame_id(),
                userGames.getRate());
    }

    public UserGames mapToUser(final  UserGamesDto userGamesDto){
        return new UserGames(userGamesDto.getId(),
                userGamesDto.getUser_id(),
                userGamesDto.getGame_id(),
                userGamesDto.getRate());
    }

}
