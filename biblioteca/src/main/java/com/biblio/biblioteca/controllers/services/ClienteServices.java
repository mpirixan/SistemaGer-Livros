package com.biblio.biblioteca.controllers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.biblio.biblioteca.domain.model.Cliente;
import com.biblio.biblioteca.domain.model.dto.CadastroClienteDTO;
import com.biblio.biblioteca.repository.ClienteRepository;

@Service
@Validated
public class ClienteServices {
	
	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> findAll(){
		return (List<Cliente>) repository.findAll();
	}
	
	
	@Transactional
	public Cliente insert(CadastroClienteDTO obj) {
		Cliente cliente = new Cliente();
		cliente.setNome(obj.getNome());
		cliente.setUsuario(obj.getUsuario());
		return repository.save(cliente);
	}
}
