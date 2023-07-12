package br.com.jrgaj.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jrgaj.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
