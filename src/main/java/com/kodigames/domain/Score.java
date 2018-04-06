package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity()
@Table(name = "SCORES")
public final class Score {

    private Long id;
    private int score;
    private UserGame userGame;

    public Score() {
    }

    public Score(Long id, int score, UserGame userGame) {
        this.id = id;
        this.score = score;
        this.userGame = userGame;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "SCORE")
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @ManyToOne
    @JoinColumn(name = "USER_GAME_ID")
    public UserGame getUserGame() {
        return userGame;
    }

    public void setUserGame(UserGame userGame) {
        this.userGame = userGame;
    }
}
