package com.biblio.biblioteca.controllers;

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

import com.biblio.biblioteca.controllers.services.UsuarioServices;
import com.biblio.biblioteca.domain.model.Usuario;
import com.biblio.biblioteca.domain.model.dto.UsuarioClienteDTO;

import io.swagger.annotations.Api;
@CrossOrigin(origins = "http://127.0.0.1:3000")
@RestController
@Api
@RequestMapping(value="/serviços-cliente")
public class UsuarioController {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UsuarioServices services;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> list = services.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping(value = "/cadastro-usuario")
	public UsuarioClienteDTO insert(@RequestBody UsuarioClienteDTO obj) {
		return modelMapper.map(services.insert(obj),UsuarioClienteDTO.class);
	}
}
