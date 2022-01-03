package com.biblio.biblioteca.domain.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idlivro")
	private Long idLivro;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="autor")
	private String autor;
	
	@Column(name="datadecadastro")
	private LocalDate dataCadastro;
	
	public Livro() {
		
	}

	public Livro(Long idLivro, String nome, String autor, LocalDate dataCadastro) {
		super();
		this.idLivro = idLivro;
		this.nome = nome;
		this.autor = autor;
		this.dataCadastro = dataCadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, dataCadastro, idLivro, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(dataCadastro, other.dataCadastro)
				&& Objects.equals(idLivro, other.idLivro) && Objects.equals(nome, other.nome);
	}

	public Long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
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

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
}
