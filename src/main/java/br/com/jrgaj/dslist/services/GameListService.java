package br.com.jrgaj.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.jrgaj.dslist.dto.GameListDTO;
import br.com.jrgaj.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		return gameListRepository.findAll().stream()
				.map(x -> new GameListDTO(x)).toList();
	}

}
