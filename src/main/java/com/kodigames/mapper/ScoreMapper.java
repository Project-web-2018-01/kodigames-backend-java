package com.kodigames.mapper;

import com.kodigames.domain.Score;
import com.kodigames.domain.ScoreDto;
import org.springframework.stereotype.Component;

@Component
public class ScoreMapper {

    public ScoreDto mapToScoreDto(final Score score) {
        return new ScoreDto(
                score.getId(),
                score.getScore());
    }

    public Score mapToScore(final ScoreDto scoreDto) {
        return new Score(
                scoreDto.getId(),
                scoreDto.getScore());
    }
}
