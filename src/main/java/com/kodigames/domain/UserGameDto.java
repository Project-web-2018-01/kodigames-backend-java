package com.kodigames.domain;

public final class UserGameDto {
    private Long id;
    private Long userId;
    private Long gameId;
    private int rate;

    public UserGameDto(Long id, Long userId, Long gameId, int rate) {
        this.id = id;
        this.userId = userId;
        this.gameId = gameId;
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
