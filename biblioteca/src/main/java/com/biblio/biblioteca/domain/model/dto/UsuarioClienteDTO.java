package com.biblio.biblioteca.domain.model.dto;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

public class UsuarioClienteDTO implements Serializable{

	private static final long serialVersionUID = -8330485494789520111L;

	@Schema(description = "Nome do cliente")
	private String nome;
	
	@Schema(description = "Usuário único do sistema")
	private String usuario;

	@Override
	public int hashCode() {
		return Objects.hash(nome, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioClienteDTO other = (UsuarioClienteDTO) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(usuario, other.usuario);
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
