package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity()
@Table(name = "SCORE")
public final class Score {

    private long Id;
    private long gameId;
    private long userId;
    private int score;

    public Score(long Id, long gameId, long userId, int score) {
        this.Id = Id;
        this.gameId = gameId;
        this.userId = userId;
        this.score = score;
    }

    public Score() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public long getScoreId() {
        return Id;
    }

    public void setScoreId(long scoreId) {
        this.Id = Id;
    }

    @NotNull
    @Column(name = "GAME_ID")
    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    @NotNull
    @Column(name = "USER_ID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @NotNull
    @Column(name = "SCORE")
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
