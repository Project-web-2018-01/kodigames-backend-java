package com.kodigames.mapper;

import com.kodigames.domain.GameRating;
import com.kodigames.domain.GameRatingDto;
import org.springframework.stereotype.Component;

@Component
public class GameRatingMapper {

    public GameRating mapToGameRatingDto(final GameRatingDto gameRatingDto) {
        return new GameRating(
                gameRatingDto.getId(),
                gameRatingDto.getRate());
    }

    public GameRatingDto mapToGameRating(final GameRating gameRating) {
        return new GameRatingDto(
                gameRating.getId(),
                gameRating.getRate());
    }
}