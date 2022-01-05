package com.biblio.biblioteca.domain.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="usuario")
public class Usuario {

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUsuario")
    private Long idUsuario;
    
    @Column(name = "apelido_usuario", unique =true)
    @NotEmpty(message = "*Por favor, defina um usuário")
    private String apelidoUsuario;
    
    @Column(name = "email", unique = true)
    @Email(message = "*Defina um Email válido")
    @NotEmpty(message = "*Por favor, defina um email válido")
    private String email;
    
    @Column(name = "senha")
    @NotEmpty(message = "*Defina uma senha")
    private String password;
    
    @Column(name = "nome")
    @NotEmpty(message = "*Defina um nome")
    private String nome;
    

    public Usuario() {
    	
    }


	public Usuario(Long idUsuario, @NotEmpty(message = "*Por favor, defina um usuário") String apelidoUsuario,
			@Email(message = "*Defina um Email válido") @NotEmpty(message = "*Por favor, defina um email válido") String email,
			@NotEmpty(message = "*Defina uma senha") String password,
			@NotEmpty(message = "*Defina um nome") String nome) {
		super();
		this.idUsuario = idUsuario;
		this.apelidoUsuario = apelidoUsuario;
		this.email = email;
		this.password = password;
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		return Objects.hash(apelidoUsuario, email, idUsuario, nome, password);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apelidoUsuario, other.apelidoUsuario) && Objects.equals(email, other.email)
				&& Objects.equals(idUsuario, other.idUsuario) && Objects.equals(nome, other.nome)
				&& Objects.equals(password, other.password);
	}


	public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
    
    

}
