package com.biblio.biblioteca.controllers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import java.util.Base64;
import com.biblio.biblioteca.domain.model.Usuario;
import com.biblio.biblioteca.domain.model.dto.UsuarioDTO;
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
	public Usuario insert(UsuarioDTO obj) {
		Usuario cliente = new Usuario();
		cliente.setNome(obj.getNome());
		cliente.setApelidoUsuario(obj.getApelidoUsuario());
		cliente.setPassword(Base64.getEncoder().encodeToString(obj.getPassword().getBytes()));
		cliente.setEmail(obj.getEmail());;
		return repository.save(cliente);
	}
}
