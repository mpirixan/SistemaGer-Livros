package com.biblio.biblioteca.controllers.services;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.biblio.biblioteca.domain.model.Livro;
import com.biblio.biblioteca.domain.model.dto.CadastroLivroDTO;
import com.biblio.biblioteca.domain.model.dto.UpdateLivroDTO;
import com.biblio.biblioteca.repository.LivroRepository;

@Service
@Validated
public class LivroServices {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private LivroRepository repository;
	
	public List<Livro> findAll(){
		return (List<Livro>) repository.findAll();
	}
	/*
	@Transactional
	public Livro insert(CadastroLivroDTO obj) {
		Livro livro = new Livro();
		livro.setNome(obj.getNome());
		livro.setAutor(obj.getAutor());
		livro.setDataCadastro(LocalDate.now());
		return repository.save(livro);
	}
	*/
	
	@Transactional
	public Livro insert(CadastroLivroDTO obj) {
 em.createNativeQuery("INSERT INTO livro (nome, autor,datadecadastro,usuariodono) VALUES (?,?,?,?)")
			.setParameter(1, obj.getNome())
			.setParameter(2, obj.getAutor())
			.setParameter(3, LocalDate.now())
			.setParameter(4, obj.getUsuarioDono())
			.executeUpdate();
	Livro livro = new Livro(); 
	livro = repository.findByNome(obj.getNome());
	return livro; 
	}
	
	public List<Livro> listarLivros() {
		return (List<Livro>) repository.findAll();
	}
	
	@Transactional
	public Livro delete(Long idLivro) {
		Livro entity = repository.findByIdLivro(idLivro);
		repository.delete(entity);
		return null;
	}

	@Transactional
	public Livro update(Long idLivro, UpdateLivroDTO obj) {
		Livro entity = repository.findByIdLivro(idLivro);
		entity.setAutor(obj.getAutor());
		entity.setNome(obj.getNome());
		entity.setDataCadastro(LocalDate.now());
		
		return repository.save(entity);
	}

}
