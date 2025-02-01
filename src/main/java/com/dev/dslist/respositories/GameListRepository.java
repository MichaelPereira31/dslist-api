package com.dev.dslist.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dslist.entities.GameList;

public interface GameListRepository  extends JpaRepository<GameList, Long>{}
