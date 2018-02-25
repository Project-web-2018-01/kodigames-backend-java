package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity()
@Table(name = "SCORES")
public final class Score {

    private long id;
    private int score;

    public Score(long id, int score) {
        this.id = id;
        this.score = score;
    }

    public Score() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

}
