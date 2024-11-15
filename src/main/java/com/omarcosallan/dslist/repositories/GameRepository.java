package com.omarcosallan.dslist.repositories;

import com.omarcosallan.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
