package com.omarcosallan.dslist.repositories;

import com.omarcosallan.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameListRepository extends JpaRepository<GameList, Long> {
}
