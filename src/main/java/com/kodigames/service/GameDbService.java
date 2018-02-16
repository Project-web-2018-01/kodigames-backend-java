package com.kodigames.service;

import com.kodigames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GameDbService {
    @Autowired
    private GameRepository gameRepository;

    //void createGame(Game game);
    //Game getGame(Long gameId);
    //Game updateGame(GameDto gameDto);
    //void deleteGame(Long gameId);
}
