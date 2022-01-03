package com.biblio.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;

import com.biblio.biblioteca.domain.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
