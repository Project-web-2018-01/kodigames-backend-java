package com.kodigames.domain;

public final class GameDto {
    private long id;
    private String name;
    private String desc;

    public GameDto(long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public long getId() { return id; }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
