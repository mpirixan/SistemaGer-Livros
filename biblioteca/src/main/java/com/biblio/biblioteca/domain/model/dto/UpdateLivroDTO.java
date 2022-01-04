package com.biblio.biblioteca.domain.model.dto;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

public class UpdateLivroDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 683308644485050816L;

	@Schema(description = "Nome da obra")
	private String nome;
	
	@Schema(description = "Nome do autor")
	private String autor;

	@Override
	public int hashCode() {
		return Objects.hash(autor, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UpdateLivroDTO other = (UpdateLivroDTO) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(nome, other.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}


	
	
}
