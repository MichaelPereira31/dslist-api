package com.dev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.dslist.dto.GameListDTO;
import com.dev.dslist.entities.GameList;
import com.dev.dslist.respositories.GameListRepository;

@Service
public class GameListService {
  @Autowired
  private GameListRepository gameListRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> games = gameListRepository.findAll();
    List<GameListDTO> gamesMin = games.stream().map(x -> new GameListDTO(x)).toList();
    return gamesMin;
  }
}
