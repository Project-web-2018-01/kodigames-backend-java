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

    public void createScore(Score score) {
        scoreRepository.save(score);
    }

    public Optional<Score> getScore(Long id) {
        return scoreRepository.findById(id);
    }

    public Score updateScore(Score score) {
        return scoreRepository.save(score);
    }

    public void deleteScore(Long id) {
        scoreRepository.deleteById(id);
    }


}
