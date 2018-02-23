package com.kodigames.mapper;

import com.kodigames.domain.Score;
import com.kodigames.domain.ScoreDto;
import org.springframework.stereotype.Component;

@Component
public class ScoreMapper {

    public ScoreDto mapToScoreDto(final Score score) {
        return new ScoreDto(
                score.getGameId(),
                score.getGameId(),
                score.getUserId(),
                score.getScore());
    }

    public Score mapToScoreDto(final ScoreDto scoreDto) {
        return new Score(
                scoreDto.getGameId(),
                scoreDto.getGameId(),
                scoreDto.getUserId(),
                scoreDto.getScore());
    }
}
