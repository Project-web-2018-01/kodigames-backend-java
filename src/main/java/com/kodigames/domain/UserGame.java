package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER_GAME")
public final class UserGame {
    private Long id;
    private Long userId;
    private Long gameId;
    private int rate;
    private List<Score> scoreList = new ArrayList<> ();

    public UserGame(Long id, Long userId, Long gameId, int rate) {
        this.id = id;
        this.userId = userId;
        this.gameId = gameId;
        this.rate = rate;
    }

    public UserGame() {
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

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @ManyToOne
    @JoinColumn(name = "GAME_ID")
    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    @NotNull
    @Column(name = "RATE")
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @OneToMany(
            targetEntity = Score.class,
            cascade = CascadeType.ALL,
            mappedBy = "USER_GAME_ID",
            fetch = FetchType.LAZY
    )
    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }
}

