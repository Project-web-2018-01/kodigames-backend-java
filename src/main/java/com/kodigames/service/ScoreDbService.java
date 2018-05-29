package com.kodigames.service;

import com.kodigames.domain.Score;
import com.kodigames.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScoreDbService {

    @Autowired
    private ScoreRepository scoreRepository;

    public Score createScore(Score score) {
        return scoreRepository.save(score);
    }

    public Optional<Score> getScore(Long scoreId) {
        return scoreRepository.findById(scoreId);
    }

    public void deleteScore(Long scoreId) {
        scoreRepository.deleteById(scoreId);
    }

}
