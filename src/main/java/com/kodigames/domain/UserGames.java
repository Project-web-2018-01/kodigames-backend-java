package com.kodigames.domain;

public final class UserGames {
    private Long id;
    private Long user_id;
    private Long game_id;
    private int rate;

    public UserGames(Long id, Long user_id, Long game_id, int rate) {
        this.id = id;
        this.user_id = user_id;
        this.game_id = game_id;
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getGame_id() {
        return game_id;
    }

    public void setGame_id(Long game_id) {
        this.game_id = game_id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}