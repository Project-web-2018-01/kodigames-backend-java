package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USERS")
public final class User {
    private Long id;
    private String firstName;
    private String surname;
    private String login;
    private String password;
    private List<UserGame> userGameList = new ArrayList<> ();

    public User(Long id, String firstName, String surname, String login, String password) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstName() {
        return firstName;
    }

    @NotNull
    @Column(name = "SURNAME")
    public String getSurname() {
        return surname;
    }

    @NotNull
    @Column(name = "LOGIN")
    public String getLogin() {
        return login;
    }

    @NotNull
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    @OneToMany(
            targetEntity = UserGame.class,
            cascade = CascadeType.ALL,
            mappedBy = "USER_ID",
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
