package com.kodigames.mapper;

import com.kodigames.domain.Game;
import com.kodigames.domain.GameDto;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {

    public GameDto mapToGameDto(final Game game) {
        return new GameDto (
                game.getId (),
                game.getName (),
                game.getDesc ());
    }

    public Game mapToGame(final GameDto gameDto) {
        return new Game (
                gameDto.getId (),
                gameDto.getName (),
                gameDto.getDesc ());
    }
}