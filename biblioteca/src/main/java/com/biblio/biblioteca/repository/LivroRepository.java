package com.biblio.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;

import com.biblio.biblioteca.domain.model.Livro;

public interface LivroRepository extends CrudRepository<Livro, Long>{

}
