package com.practicas.springjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.practicas.springjpa.Repositories.ClienteRepository;
import com.practicas.springjpa.model.Cliente;

public class ServicioCliente {
	@Autowired
	ClienteRepository repo;
	public void create(Cliente c) {
		repo.save(c);
	}
	public List<Cliente> readAll() {
		return (List<Cliente>)repo.findAll();
	}
	public Cliente readById(Long id) {
		return repo.findById(id).get();
	}
	/*public Cliente update(Long id, Cliente c) {
		return repo.
	}*/
}
