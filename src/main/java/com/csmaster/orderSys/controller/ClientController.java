package com.csmaster.orderSys.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csmaster.orderSys.model.Client;
import com.csmaster.orderSys.repository.ClientRepository;

@RestController
@RequestMapping("/cliente")
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;

	@GetMapping("/lista")
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@GetMapping("/{id}")
	public Client findById(@PathVariable Integer id) {
		Optional<Client> cliente = clientRepository.findById(id);
		if (cliente.isPresent()) {
			return cliente.get();
		} else {
			return null;
		}
	}
	
	@PostMapping
	public String save(@RequestBody Client client) {
		System.out.println(client);
		try {
			clientRepository.save(client);
			return "Sucesso";
		} catch (Exception e) {
			return "Houve um erro ao adicionar";
		}
	}
	
	@PutMapping
	public String update(@RequestBody Client client) {
		try {
			clientRepository.save(client);
			return "Sucesso";
		} catch (Exception e) {
			return "Houve um erro ao adicionar";
		}
	}

	
	@DeleteMapping("/{id}")
	public String update(@PathVariable Integer id) {
		try {
			clientRepository.deleteById(id);
			return "Sucesso";
		} catch (Exception e) {
			return "Houve um erro ao adicionar";
		}
	}

}
