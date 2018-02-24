package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "GAME_RATINGS")
public final class GameRating {
    private long id;
    private int rate;

    public GameRating(long id, int rate) {
        this.id = id;
        this.rate = rate;
    }

    public GameRating() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "ID", unique = true)
    public long getId() {
        return id;
    }

    @NotNull
    @Column(name = "RATE")
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
