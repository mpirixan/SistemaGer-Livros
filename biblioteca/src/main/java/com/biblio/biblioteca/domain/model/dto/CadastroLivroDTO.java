package com.biblio.biblioteca.domain.model.dto;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;


public class CadastroLivroDTO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1900343600532425449L;

    @NotNull
    @NotEmpty
	@Schema(description = "Nome da obra")
	private String nome;

    @NotNull
    @NotEmpty
	@Schema(description = "Nome do autor")
	private String autor;

    @NotNull
    @NotEmpty
	@Schema(description = "nome do usuário")
	private String usuario;
	
	


	@Override
	public int hashCode() {
		return Objects.hash(autor, nome, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroLivroDTO other = (CadastroLivroDTO) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(nome, other.nome)
				&& Objects.equals(usuario, other.usuario);
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
