package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Entity
@Table(name = "GAMES")
public final class Game {
    private Long id;
    private String name;
    private String desc;
    //private List<UserGames> userGamesList = new ArrayList<> ();

    public Game() {
    }

    public Game(Long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
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

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
//    public List<UserGames> getUserGamesList() {
//        return userGamesList;
//    }
//
//    public void set userGamesList(List<UserGames> userGamesList) {
//        this.userGamesList = userGamesList;
//    }

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
