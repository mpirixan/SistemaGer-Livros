package com.biblio.biblioteca.controllers.services;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.biblio.biblioteca.controllers.services.excecoes.DatabaseException;
import com.biblio.biblioteca.domain.model.Usuario;
import com.biblio.biblioteca.domain.model.dto.CadastroUsuarioDTO;
import com.biblio.biblioteca.repository.UsuarioRepository;

@Service
@Validated
public class UsuarioServices {

	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> findAll(){
		return (List<Usuario>) repository.findAll();
	}
	
	@Transactional
	public Usuario insert(CadastroUsuarioDTO obj) {
		Usuario cliente = new Usuario();
		Usuario entity = new Usuario();
		Usuario entidade = new Usuario();
		entity = repository.findByEmail(obj.getEmail());
		entidade = repository.findByApelidoUsuario(obj.getApelidoUsuario());
		if(entity != null) {
			throw new DatabaseException("Elemento já possui cadastro no sistema. email: " + obj.getEmail());
		}
		if(entidade != null) {
			throw new DatabaseException("Elemento já possui cadastro no sistema. apelido : " + obj.getApelidoUsuario());
		}
		cliente.setNome(obj.getNome());
		cliente.setApelidoUsuario(obj.getApelidoUsuario());
		cliente.setPassword(Base64.getEncoder().encodeToString(obj.getPassword().getBytes()));
		cliente.setEmail(obj.getEmail());;
		return repository.save(cliente);
	}
}
