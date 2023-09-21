package edu.ifam.dra.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifam.dra.chat.dto.DTOMensagem;
import edu.ifam.dra.chat.model.Contato;
import edu.ifam.dra.chat.model.Mensagem;
import java.util.List;


public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
	List<Mensagem> findAllByReceptor(Contato receptor);
	List<Mensagem> findAllByEmissor(Contato emissor);
}