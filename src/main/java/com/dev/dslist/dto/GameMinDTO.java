package com.dev.dslist.dto;

import com.dev.dslist.entities.Game;
import com.dev.dslist.projections.GameMinProjection;

import lombok.Getter;

@Getter
public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

  public GameMinDTO(){}

  public GameMinDTO(Game entity) {
    this.id = entity.getId();
    this.title = entity.getTitle();
    this.year = entity.getYear();
    this.imgUrl = entity.getImgUrl();
    this.shortDescription = entity.getShortDescription();
  }

  public GameMinDTO(GameMinProjection entity) {
    this.id = entity.getId();
    this.title = entity.getTitle();
    this.year = entity.getYear();
    this.imgUrl = entity.getImgUrl();
    this.shortDescription = entity.getShortDescription();
  }
}
