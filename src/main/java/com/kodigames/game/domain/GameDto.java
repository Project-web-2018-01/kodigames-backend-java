package com.kodigames.game.domain;

public class GameDto {
    private Long gameId;
    private String name;
    private String desc;

    public GameDto(Long gameId, String name, String desc) {
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
