package com.biblio.biblioteca.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.biblio.biblioteca.domain.model.Livro;

public interface LivroRepository extends CrudRepository<Livro, Long>{

	@Modifying
	@Query("insert into livro l  c.saldo = c.saldo + ?1 where c.idConta = ?2")
	void insereUsuario(String usuario);
	
}
