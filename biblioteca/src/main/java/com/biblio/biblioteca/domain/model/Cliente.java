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

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idcliente")
	private Long idCliente;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="usuario", unique = true)
	private String usuario;
	
	public Cliente() {
		
	}

	public Cliente(Long idCliente, String nome, String usuario) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCliente, nome, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(idCliente, other.idCliente) && Objects.equals(nome, other.nome)
				&& Objects.equals(usuario, other.usuario);
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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
