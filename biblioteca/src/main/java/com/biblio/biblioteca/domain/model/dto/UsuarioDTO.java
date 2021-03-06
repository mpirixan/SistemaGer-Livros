package com.biblio.biblioteca.domain.model.dto;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 596872047721215402L;

	@Schema(description = "Id usuário")
	private Long idUsuario;
	
	@Schema(description = "Nome do cliente")
	private String nome;
	
	@Schema(description = "Usuário único do sistema")
	private String apelidoUsuario;

	@Schema(description = "Email do usuário")
	private String email;

	@Override
	public int hashCode() {
		return Objects.hash(apelidoUsuario, email, idUsuario, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDTO other = (UsuarioDTO) obj;
		return Objects.equals(apelidoUsuario, other.apelidoUsuario) && Objects.equals(email, other.email)
				&& Objects.equals(idUsuario, other.idUsuario) && Objects.equals(nome, other.nome);
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelidoUsuario() {
		return apelidoUsuario;
	}

	public void setApelidoUsuario(String apelidoUsuario) {
		this.apelidoUsuario = apelidoUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
