package edu.ifam.dra.chat.dto;

import java.util.Calendar;

import edu.ifam.dra.chat.model.Mensagem;

public class DTOMensagem {
	
	private Long id;
	
	private Calendar dataHora;
	private String conteudo;
	private Long idEmissor;
	private Long idReceptor;
	
	public DTOMensagem(Mensagem mensagem) {
		this.id = mensagem.getId();
		this.dataHora = mensagem.getDataHora();
		this.conteudo = mensagem.getConteudo();
		this.idEmissor = mensagem.getEmissor().getId();
		this.idReceptor = mensagem.getReceptor().getId();
	}
	
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
	public Long getIdEmissor() {
		return idEmissor;
	}
	public void setIdEmissor(Long idEmissor) {
		this.idEmissor = idEmissor;
	}
	public Long getIdReceptor() {
		return idReceptor;
	}
	public void setIdReceptor(Long idReceptor) {
		this.idReceptor = idReceptor;
	}
	
	

}