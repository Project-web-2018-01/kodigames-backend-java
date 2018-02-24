package com.kodigames.controller;

import com.kodigames.domain.GameDto;
import com.kodigames.mapper.GameMapper;
import com.kodigames.service.GameDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class GameController {
    @Autowired
    private GameMapper gameMapper;

    @Autowired
    private GameDbService service;

    @RequestMapping(method = RequestMethod.GET, value = "/games/{gameId}")
    public GameDto getGame(Long gameId) throws GameNotFoundException {
        return gameMapper.mapToGameDto (service.getGame (gameId).orElseThrow (GameNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/games", consumes = APPLICATION_JSON_VALUE)
    public void createGame(@RequestBody GameDto gameDto) {
        service.createGame (gameMapper.mapToGame (gameDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/games")
    public GameDto updateGame(@RequestBody GameDto gameDto) {
        return gameMapper.mapToGameDto (service.updateGame (gameMapper.mapToGame (gameDto)));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/games/{gameId}")
    public void deleteGame(Long gameId) {
        service.deleteGame (gameId);
    }
}
