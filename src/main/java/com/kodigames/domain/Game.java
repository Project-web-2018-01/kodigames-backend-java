package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GAMES")
public final class Game {
    private Long id;
    private String name;
    private String desc;
    private List<UserGame> userGameList = new ArrayList<> ();

    public Game(Long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Game() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
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

    @OneToMany(
            targetEntity = UserGame.class,
            cascade = CascadeType.ALL,
            mappedBy = "game",
            fetch = FetchType.LAZY
    )
    public List<UserGame> getUserGameList() {
        return userGameList;
    }

    public void setUserGameList(List<UserGame> userGameList) {
        this.userGameList = userGameList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
