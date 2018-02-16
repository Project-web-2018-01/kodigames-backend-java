package com.kodigames.game.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "GAMES")
public class Game {
    private Long gameId;

    private String name;

    private String desc;

    public Game() {
    }

    public Game(Long gameId, String name, String desc) {
        this.gameId = gameId;
        this.name = name;
        this.desc = desc;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public Long getGameId() {
        return gameId;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @NotNull
    @Column(name = "DESCRIPTION")
    public String getDesc() {
        return desc;
    }
}
