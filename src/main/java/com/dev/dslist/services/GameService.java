package com.dev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.dslist.dto.GameDTO;
import com.dev.dslist.dto.GameMinDTO;
import com.dev.dslist.entities.Game;
import com.dev.dslist.projections.GameMinProjection;
import com.dev.dslist.respositories.GameRepository;


@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    List<GameMinDTO> games = gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    return games;
  }

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    Game game = gameRepository.findById(id).get();
    return new GameDTO(game);
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findByList(Long listId) {
    List<GameMinProjection> result = 
      gameRepository.searchByList(listId);
    List<GameMinDTO> games = result.stream().map(x -> new GameMinDTO(x)).toList();
    return games;
  }
}
