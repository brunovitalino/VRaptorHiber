package br.com.bv.model;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@Table(name="enfermeiro")
//@NamedQuery(name = "todosContatos", query = "SELECT nome FROM Organization nome")
public class Usuario
{
	@Column
	@Id
	@GeneratedValue
	private int id;
	
	@Column(length=25, nullable=false)
	private String nome;

	@Column(length=15)
	private String login;

	@Column(length=15)
	private String senha;
	
	@Column(length=50)
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
