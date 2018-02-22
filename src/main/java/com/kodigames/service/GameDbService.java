package com.kodigames.service;

import com.kodigames.domain.Game;
import com.kodigames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameDbService {
    @Autowired
    private GameRepository repository;

    public void createGame(Game game) {
        repository.save (game);
    }

    public Optional<Game> getGame(Long gameId) {
        return repository.findById (gameId);
    }

    public Game updateGame(Game game) {
        return repository.save (game);
    }

    public void deleteGame(Long gameId) {
        repository.deleteById (gameId);
    }
}
