package com.dev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dslist.dto.GameMinDTO;
import com.dev.dslist.respositories.GameRepository;

@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;

  public List<GameMinDTO> findAll() {
    List<GameMinDTO> games = gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    return games;
  }
}
