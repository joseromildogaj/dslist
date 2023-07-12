package br.com.jrgaj.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jrgaj.dslist.dto.GameDTO;
import br.com.jrgaj.dslist.dto.GameMinDTO;
import br.com.jrgaj.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.findAll();
	}
	
	@GetMapping("/{id}")
	public GameDTO findById(@PathVariable("id") Long id){
		return gameService.findById(id);
	}

}
