package com.csmaster.orderSys.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csmaster.orderSys.model.Client;
import com.csmaster.orderSys.model.Product;
import com.csmaster.orderSys.repository.ProductRepository;

@RestController
@RequestMapping("/produto")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/lista")
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@GetMapping("/{id}")
	public Product findById(@PathVariable Integer id) {
		Optional<Product> cliente = productRepository.findById(id);
		if (cliente.isPresent()) {
			return cliente.get();
		} else {
			return null;
		}
	}
	
	@PostMapping
	public String save(@RequestBody Product product) {
		System.out.println(product);
		try {
			productRepository.save(product);
			return "Sucesso";
		} catch (Exception e) {
			return "Houve um erro ao adicionar";
		}
	}
	
	@PutMapping
	public String update(@RequestBody Product product) {
		try {
			productRepository.save(product);
			return "Sucesso";
		} catch (Exception e) {
			return "Houve um erro ao adicionar";
		}
	}

	
	@DeleteMapping("/{id}")
	public String update(@PathVariable Integer id) {
		try {
			productRepository.deleteById(id);
			return "Sucesso";
		} catch (Exception e) {
			return "Houve um erro ao adicionar";
		}
	}

}
