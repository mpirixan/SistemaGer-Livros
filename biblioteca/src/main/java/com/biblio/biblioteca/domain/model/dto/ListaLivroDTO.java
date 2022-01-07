package com.biblio.biblioteca.domain.model.dto;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

public class ListaLivroDTO implements Serializable {

	private static final long serialVersionUID = -8330485497989520111L;

	@Schema(description = "Id livro")
	private Long idLivro;
	
	@Schema(description = "Nome do Livro")
	private String nome;



	@Override
	public int hashCode() {
		return Objects.hash(idLivro, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaLivroDTO other = (ListaLivroDTO) obj;
		return Objects.equals(idLivro, other.idLivro) && Objects.equals(nome, other.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}
	
	
}
