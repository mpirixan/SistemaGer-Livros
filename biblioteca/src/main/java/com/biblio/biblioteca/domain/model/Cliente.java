package com.biblio.biblioteca.domain.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {

	
	@Column(name="nome")
	private String nome;
	
	@Id
	@Column(name="usuario", unique = true)
	private String usuario;
	
	public Cliente() {
		
	}

	public Cliente( String nome, String usuario) {
		super();
		this.nome = nome;
		this.usuario = usuario;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
