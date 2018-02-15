package com.kodigames.game.repository;

import com.kodigames.game.domain.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {
    //Game save(Game game);
    //Game findById(Long gameId);
    //Game deleteById(Long gameId);
}
