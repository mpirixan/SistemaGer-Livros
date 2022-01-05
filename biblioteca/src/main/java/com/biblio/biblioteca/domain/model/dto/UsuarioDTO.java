package com.biblio.biblioteca.domain.model.dto;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = -8330485494789520111L;

	@Schema(description = "Nome do cliente")
	private String nome;
	
	@Schema(description = "Usuário único do sistema")
	private String apelidoUsuario;
	
	@Schema(description = "Senha criada pelo usuario")
	private String password;

	@Schema(description = "Email do usuário")
	private String email;

	@Override
	public int hashCode() {
		return Objects.hash(apelidoUsuario, email, nome, password);
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
				&& Objects.equals(nome, other.nome) && Objects.equals(password, other.password);
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
