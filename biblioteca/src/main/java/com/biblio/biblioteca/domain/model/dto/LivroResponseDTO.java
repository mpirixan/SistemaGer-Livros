package com.biblio.biblioteca.domain.model.dto;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

public class LivroResponseDTO implements Serializable {

	private static final long serialVersionUID = -8330485497989520111L;

	@Schema(description = "Nome do Livro")
	private String nome;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LivroResponseDTO other = (LivroResponseDTO) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
