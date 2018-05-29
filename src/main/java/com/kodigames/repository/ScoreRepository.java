package com.kodigames.repository;

import com.kodigames.domain.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreRepository extends CrudRepository <Score, Long>{

    }
