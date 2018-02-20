package com.kodigames.domain;

public class GameRatingDto {
    long ratingId;
    long gameId;
    long userId;
    int rate;

    public GameRatingDto(long ratingId, long gameId, long userId, int rate) {
        this.ratingId = ratingId;
        this.gameId = gameId;
        this.userId = userId;
        this.rate = rate;
    }

    public long getRatingId() {
        return ratingId;
    }

    public long getGameId() {
        return gameId;
    }

    public long getUserId() {
        return userId;
    }

    public int getRate() {
        return rate;
    }
}
