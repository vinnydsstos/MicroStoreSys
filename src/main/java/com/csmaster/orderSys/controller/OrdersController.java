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

import com.csmaster.orderSys.dto.OrderRequestData;
import com.csmaster.orderSys.model.Address;
import com.csmaster.orderSys.model.Order;
import com.csmaster.orderSys.repository.AddressRepository;
import com.csmaster.orderSys.repository.OrdersRepository;

@RestController
@RequestMapping("/pedido")
public class OrdersController {

	@Autowired
	private OrdersRepository ordersRepository;
	

	@Autowired
	private AddressRepository addressRepository;

	@GetMapping("/lista")
	public List<Order> findAll() {
		return ordersRepository.findAll();
	}

	@GetMapping("/{id}")
	public Order findById(@PathVariable Integer id) {
		Optional<Order> order = ordersRepository.findById(id);
		if (order.isPresent()) {
			return order.get();
		} else {
			return null;
		}
	}
	
	@PostMapping
	public String save(@RequestBody OrderRequestData rqOrder) {
		try {
			// save the address
			Address addressToSave = rqOrder.getAddress();
			addressRepository.save(addressToSave);
			
			// save the order
			Order toSave = rqOrder.toOrder();
			toSave.setAddress(addressToSave);
			ordersRepository.save(toSave);
			
			return "Sucesso!";
		} catch (Exception e) {
			return "Houve um erro ao salvar:"  + e.getMessage();
		}
	}
	
	@PutMapping
	public String update(@RequestBody OrderRequestData rqOrder) {
		try {
			// save the address
			Address addressToSave = rqOrder.getAddress();
			addressRepository.save(addressToSave);
			
			// save the order
			Order toSave = rqOrder.toOrder();
			toSave.setAddress(addressToSave);
			ordersRepository.save(toSave);
			
			return "Sucesso!";
		} catch (Exception e) {
			return "Houve um erro ao salvar:"  + e.getMessage();
		}
	}

	
	@DeleteMapping("/{id}")
	public String update(@PathVariable Integer id) {
		try {
			ordersRepository.deleteById(id);
			return "Sucesso";
		} catch (Exception e) {
			return "Houve um erro ao adicionar";
		}
	}

}
