package edu.ifam.dra.chat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifam.dra.chat.model.Contato;

@RequestMapping("/contatos")
@RestController
public class ContatoController {
	private List<Contato> contatos = new ArrayList<>();
	
	@GetMapping
	List<Contato> getContatos(){
		return contatos;
	}
	
	@GetMapping("/{id}")
	Contato getContato(@PathVariable int Id) {
		return contatos.get(Id);
	}
	
	@PostMapping
	Contato setContato(@RequestBody Contato contato) {
		contatos.add(contato);
		return contato;
	}
	
	
	@PutMapping("/{id}")
	Contato setContato(@RequestBody Contato contato, @PathVariable int id) {
		contatos.set(id, contato);
		return contato;
	}
	
	@DeleteMapping("/{id}")
	void deleteContato(@PathVariable int id) {
		contatos.remove(id);
	}
	
}