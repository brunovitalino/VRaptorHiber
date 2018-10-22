package br.com.bv.model;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@Table(name="enfermeiro")
//@NamedQuery(name = "todosContatos", query = "SELECT nome FROM Organization nome")
public class Enfermeiro
{
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="ENFERMEIRO_SEQ")
	@SequenceGenerator(name="ENFERMEIRO_SEQ", sequenceName="ENFERMEIRO_SEQ", allocationSize=1)
	private int id;
	
	@Column(length=25, nullable=false)
	private String nome;

	@Column(length=20)
	private String telefone;
	
	@Column(length=50)
	private String email;

	@Column(name="dataMensagem")
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	@Column(length=500)
	private String mensagem;
	
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
