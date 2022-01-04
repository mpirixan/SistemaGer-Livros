package com.biblio.biblioteca.controllers;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblio.biblioteca.controllers.services.LivroServices;
import com.biblio.biblioteca.domain.model.Livro;
import com.biblio.biblioteca.domain.model.dto.CadastroLivroDTO;
import com.biblio.biblioteca.domain.model.dto.LivroResponseDTO;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "http://127.0.0.1:3000")
@RestController
@Api
@RequestMapping(value="/serviços-livros")
public class LivroController {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private LivroServices services;
	
	@GetMapping
	public ResponseEntity<List<Livro>> findAll(){
		List<Livro> list = services.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping(value = "/cadastro-livro")
	public CadastroLivroDTO insert(@RequestBody CadastroLivroDTO obj) {
		return modelMapper.map(services.insert(obj),CadastroLivroDTO.class);
	}
	
	@GetMapping(value="lista-livros")
	public List<LivroResponseDTO> listarLivros(){
		return Arrays.asList(modelMapper.map(services.listarLivros(), LivroResponseDTO.class));
	}
	
}
