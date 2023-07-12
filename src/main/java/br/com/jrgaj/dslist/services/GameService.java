package br.com.jrgaj.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.jrgaj.dslist.dto.GameDTO;
import br.com.jrgaj.dslist.dto.GameMinDTO;
import br.com.jrgaj.dslist.entities.Game;
import br.com.jrgaj.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		return gameRepository.findAll().stream()
				.map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}

}
