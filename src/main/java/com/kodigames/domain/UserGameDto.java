package com.kodigames.domain;

public final class UserGameDto {
    private Long id;
    private User user;
    private Game game;
    private int rate;

    public UserGameDto(Long id, User user, Game game, int rate) {
        this.id = id;
        this.user = user;
        this.game = game;
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
