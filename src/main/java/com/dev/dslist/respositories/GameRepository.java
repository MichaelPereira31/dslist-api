package com.dev.dslist.respositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
