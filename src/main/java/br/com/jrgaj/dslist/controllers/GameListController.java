package br.com.jrgaj.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jrgaj.dslist.dto.GameListDTO;
import br.com.jrgaj.dslist.dto.GameMinDTO;
import br.com.jrgaj.dslist.services.GameListService;
import br.com.jrgaj.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable("listId") Long listId){
		return gameService.findByList(listId);
	}
	
	

}
