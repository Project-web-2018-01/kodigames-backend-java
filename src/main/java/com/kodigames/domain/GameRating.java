package com.kodigames.domain;

import javax.persistence.*;

@Entity(name = "GAME_RATINGS")
public class GameRating {
    long ratingId;
    int rate;

    public GameRating(long ratingId, int rate) {
        this.ratingId = ratingId;
        this.rate = rate;
    }

    public GameRating() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getRatingId() {
        return ratingId;
    }

    @Column(name = "RATE")
    public int getRate() {
        return rate;
    }
}
