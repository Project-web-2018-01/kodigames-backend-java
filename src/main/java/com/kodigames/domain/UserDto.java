package com.kodigames.domain;

public final class UserDto {

    private long id;
    private String firstName;
    private String surname;
    private String login;
    private String password;

    public UserDto(Long id, String firstName, String surname, String login, String password) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(long id) {
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
