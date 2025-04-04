package com.practicas.springjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Local {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_local")
	private Long idLocal;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "planta")
	private String planta;
	public Long getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPlanta() {
		return planta;
	}
	public void setPlanta(String planta) {
		this.planta = planta;
	}
	
}
