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

import com.biblio.biblioteca.controllers.services.ClienteServices;
import com.biblio.biblioteca.domain.model.Cliente;
import com.biblio.biblioteca.domain.model.dto.CadastroClienteDTO;

import io.swagger.annotations.Api;
@CrossOrigin(origins = "http://127.0.0.1:3000")
@RestController
@Api
@RequestMapping(value="/serviços-cliente")
public class ClienteController {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ClienteServices services;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> list = services.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping(value = "/cadastro-usuario")
	public CadastroClienteDTO insert(@RequestBody CadastroClienteDTO obj) {
		return modelMapper.map(services.insert(obj),CadastroClienteDTO.class);
	}
}
