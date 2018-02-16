package com.kodigames.controller;

import com.kodigames.mapper.GameMapper;
import com.kodigames.service.GameDbService;
import org.springframework.beans.factory.annotation.Autowired;

public class GameController {
    @Autowired
    private GameMapper gameMapper;

    @Autowired
    private GameDbService dbService;

    //void createGame(Game game);
    //GameDto getGame(Long gameId);
    //GameDto updateGame(GameDto gameDto);
    //void deleteGame(Long gameId);
}
