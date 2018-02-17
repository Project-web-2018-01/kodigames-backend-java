package com.kodigames.domain;

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

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }
}
