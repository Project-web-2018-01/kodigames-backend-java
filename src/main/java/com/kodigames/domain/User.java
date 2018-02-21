package com.kodigames.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USERS")
public class User {
    private Long userId;
    private String name;
    private String surname;
    private String login;
    private String password;

    public User(Long userId, String name, String surname, String login, String password) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public Long getUserId() {
        return userId;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
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
}
