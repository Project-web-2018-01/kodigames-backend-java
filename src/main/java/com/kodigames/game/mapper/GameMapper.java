package com.kodigames.game.mapper;

import com.kodigames.game.domain.Game;
import com.kodigames.game.domain.GameDto;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {

    public GameDto mapToGameDto(final Game game) {
        return new GameDto (
                game.getGameId (),
                game.getName (),
                game.getDesc ());
    }

    public Game mapToGame(final GameDto gameDto) {
        return new Game (
                gameDto.getGameId (),
                gameDto.getName (),
                gameDto.getDesc ());

    }
}
