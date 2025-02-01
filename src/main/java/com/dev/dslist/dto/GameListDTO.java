package com.dev.dslist.dto;

import com.dev.dslist.entities.GameList;

import lombok.Getter;

@Getter
public class GameListDTO {
  private Long id;
	private String name;

  public GameListDTO(GameList gameList) {
    this.id = gameList.getId();
    this.name = gameList.getName();
  }
}
