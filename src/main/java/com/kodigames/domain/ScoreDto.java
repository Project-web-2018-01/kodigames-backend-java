package com.kodigames.domain;

public final class ScoreDto {

    private Long id;
    private int score;
    private UserGame userGame;

    public ScoreDto(Long id, int score, UserGame userGame) {
        this.id = id;
        this.score = score;
        this.userGame = userGame;
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

    public UserGame getUserGame() {
        return userGame;
    }

    public void setUserGame(UserGame userGame) {
        this.userGame = userGame;
    }
}

