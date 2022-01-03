package com.biblio.biblioteca.controllers.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.biblio.biblioteca.domain.model.Livro;
import com.biblio.biblioteca.domain.model.dto.CadastroLivroDTO;
import com.biblio.biblioteca.repository.LivroRepository;

@Service
@Validated
public class LivroServices {

	@Autowired
	private LivroRepository repository;
	
	public List<Livro> findAll(){
		return (List<Livro>) repository.findAll();
	}
	
	@Transactional
	public Livro insert(CadastroLivroDTO obj) {
		Livro livro = new Livro();
		livro.setNome(obj.getNome());
		livro.setAutor(obj.getAutor());
		livro.setDataCadastro(LocalDate.now());
		livro.setCliente(obj.getUsuario());
		return repository.save(livro);
	}
	
	
}
