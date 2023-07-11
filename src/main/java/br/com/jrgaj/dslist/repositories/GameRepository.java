package br.com.jrgaj.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jrgaj.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
