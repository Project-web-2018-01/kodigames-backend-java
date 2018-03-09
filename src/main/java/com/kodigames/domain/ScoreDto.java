package com.kodigames.domain;

public final class ScoreDto {

    private Long id;
    private int score;
    private Long userGameId;

    public ScoreDto(Long id, int score, Long userGameId) {
        this.id = id;
        this.score = score;
        this.userGameId = userGameId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Long getUserGameId() {
        return userGameId;
    }

    public void setUserGameId(Long userGameId) {
        this.userGameId = userGameId;
    }
}

