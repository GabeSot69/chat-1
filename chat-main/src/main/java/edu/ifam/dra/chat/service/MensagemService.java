package edu.ifam.dra.chat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ifam.dra.chat.dto.DTOMensagem;
import edu.ifam.dra.chat.model.Mensagem;
import edu.ifam.dra.chat.repositories.MensagemRepository;

@Service
public class MensagemService {

	@Autowired
	private MensagemRepository mensagemRepository;
	
	@Autowired
	private ContatoService contatoService;
	
	public List<DTOMensagem> getMensagensReceptor(Long idReceptor){
		List<DTOMensagem> dtoMensagens = new ArrayList<>();
		List<Mensagem> mensagens = mensagemRepository.findAllByReceptor(contatoService.getContato(idReceptor));
		for (Mensagem mensagem: mensagens) {
			dtoMensagens.add(new DTOMensagem(mensagem));
		}
		
		return dtoMensagens;
	}
	
	public List<DTOMensagem> getMensagensEmissor(Long idEmissor){
		List<DTOMensagem> dtoMensagens = new ArrayList<>();
		List<Mensagem> mensagens = mensagemRepository.findAllByEmissor(contatoService.getContato(idEmissor));
		for (Mensagem mensagem: mensagens) {
			dtoMensagens.add(new DTOMensagem(mensagem));
		}
		
		return dtoMensagens;
	}
	
	public Mensagem setMensagemFromDTOMensagem(DTOMensagem dtoMensagem) {
		Mensagem mensagem = new Mensagem();
		mensagem.setDataHora(dtoMensagem.getDataHora());
		mensagem.setConteudo(dtoMensagem.getConteudo());
		mensagem.setEmissor(contatoService.getContato(dtoMensagem.getIdEmissor()));
		mensagem.setReceptor(contatoService.getContato(dtoMensagem.getIdReceptor()));
		return mensagemRepository.save(mensagem);
	}
	
	
}