package com.practicas.springjpa.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicas.springjpa.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	Optional<Cliente> findByNombre(String nombre);
	List<Cliente> findByNombreContaining(String nombre);
	List<Cliente> findByNombreContainingOrderByNombreAsc(String nombre);
	
}
