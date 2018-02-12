package com.kodigames.game.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Game {
    @Id
    @GeneratedValue
    private Long gameId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String desc;

    public Game() {
    }

    public Game(Long gameId, String name, String desc) {
        this.gameId = gameId;
        this.name = name;
        this.desc = desc;
    }

    public Long getGameId() {
        return gameId;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
