package com.kodigames.game.service;

import com.kodigames.game.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GameDbService {
    @Autowired
    private GameRepository gameRepository;

    //void createGame(Game game);
    //Game getGame(Long gameId);
    //Game updateGame(GameDto gameDto);
    //void deleteGame(Long gameId);
}
