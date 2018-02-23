package com.kodigames.domain;

public class ScoreDto {

    private long Id;
    private long gameId;
    private long userId;
    private int score;

    public ScoreDto(long Id, long gameId, long userId, int score) {
        this.Id = Id;
        this.gameId = gameId;
        this.userId = userId;
        this.score = score;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

