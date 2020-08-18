package br.com.codenation.oauth2.tutospringsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codenation.oauth2.tutospringsecurity.model.Cliente;
import br.com.codenation.oauth2.tutospringsecurity.repository.ClienteRepository;

@RestController
@RequestMapping("/clientess")
public class ClienteService {
	
	@Autowired
	private ClienteRepository clientes;
	
	@GetMapping
	public List<Cliente> listar(){
		return this.clientes.findAll();
	}
}