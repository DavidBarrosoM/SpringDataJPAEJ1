package com.practicas.springjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_orden")
	private Long idOrden;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "precioTotal")
	private double precioTotal;
	public Long getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(Long idOrden) {
		this.idOrden = idOrden;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
}
