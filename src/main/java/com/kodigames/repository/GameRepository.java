package com.kodigames.repository;

import com.kodigames.domain.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {
    //Game save(Game game);
    //Game findById(Long gameId);
    //Game deleteById(Long gameId);
}
