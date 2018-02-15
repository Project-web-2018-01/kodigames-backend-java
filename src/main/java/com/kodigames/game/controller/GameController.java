package com.kodigames.game.controller;

import com.kodigames.game.mapper.GameMapper;
import com.kodigames.game.service.GameDbService;
import org.springframework.beans.factory.annotation.Autowired;

public class GameController {
    @Autowired
    private GameMapper gameMapper;

    @Autowired
    GameDbService dbService;

    //void createGame(Game game);
    //GameDto getGame(Long gameId);
    //GameDto updateGame(GameDto gameDto);
    //void deleteGame(Long gameId);
}
