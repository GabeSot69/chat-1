package edu.ifam.dra.chat.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Mensagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Calendar dataHora = Calendar.getInstance();
	private String conteudo;
	
	@ManyToOne
	private Contato emissor;
	
	@ManyToOne
	private Contato receptor;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Calendar getDataHora() {
		return dataHora;
	}
	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Contato getEmissor() {
		return emissor;
	}
	public void setEmissor(Contato emissor) {
		this.emissor = emissor;
	}
	public Contato getReceptor() {
		return receptor;
	}
	public void setReceptor(Contato receptor) {
		this.receptor = receptor;
	}
}
