package com.biblio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblio.biblioteca.domain.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	public Livro findByNome(String nome);
	
	public Livro findByAutor(String autor);
	
/*
	@Modifying
	@Query("INSERT INTO livro (nome, autor,datadecadastro,usuario) VALUES (?,?,?,?)")
	void insereUsuario(String usuario);
	*/
}
