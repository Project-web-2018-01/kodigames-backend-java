package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "GAMES")
public class Game {
    private long id;

    private String name;

    private String desc;

    public Game() {
    }

    public Game(long gameId, String name, String desc) {
        this.id = gameId;
        this.name = name;
        this.desc = desc;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public long getId() {
        return id;
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
