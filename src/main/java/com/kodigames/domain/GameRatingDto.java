package com.kodigames.domain;

public class GameRatingDto {
    private long id;
    private int rate;

    public GameRatingDto(long id, int rate) {
        this.id = id;
        this.rate = rate;
    }

    public long getId() {
        return id;
    }

    public int getRate() {
        return rate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
