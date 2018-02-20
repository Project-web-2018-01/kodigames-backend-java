package com.kodigames.domain;

import javax.persistence.*;

@Entity(name = "GAME_RATINGS")
public class GameRating {
    long ratingId;
    long gameId;
    long userId;
    int rate;

    public GameRating(long ratingId, long gameId, long userId, int rate) {
        this.ratingId = ratingId;
        this.gameId = gameId;
        this.userId = userId;
        this.rate = rate;
    }

    public GameRating() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getRatingId() {
        return ratingId;
    }

    @Column(name = "GAME_ID")
    public long getGameId() {
        return gameId;
    }

    @Column(name = "USER_ID")
    public long getUserId() {
        return userId;
    }

    @Column(name = "RATE")
    public int getRate() {
        return rate;
    }
}
