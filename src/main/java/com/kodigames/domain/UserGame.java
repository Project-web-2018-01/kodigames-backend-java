package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER_GAME")
public final class UserGame {
    private Long id;
    private User user;
    private Game game;
    private int rate;
    private List<Score> scoreList = new ArrayList<> ();

    public UserGame(Long id, User user, Game game, int rate) {
        this.id = id;
        this.user = user;
        this.game = game;
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
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "GAME_ID")
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
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
            mappedBy = "userGame",
            fetch = FetchType.LAZY
    )
    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }
}

