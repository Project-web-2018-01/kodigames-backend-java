package com.kodigames.domain;

public class GameRatingDto {
    long ratingId;
    int rate;

    public GameRatingDto(long ratingId, int rate) {
        this.ratingId = ratingId;
        this.rate = rate;
    }

    public long getRatingId() {
        return ratingId;
    }

    public int getRate() {
        return rate;
    }
}
