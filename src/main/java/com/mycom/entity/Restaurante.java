package com.mycom.entity;

/**
 * @author Vintagestep
 * Clase que representa la entidad de restaurante.
 */

public class Restaurante {
	
	// Atributos
	
	private String nombre;
	private String direccion;
	private String ciudad;
	private Gerente gerente;
	
	// Constructores
	
	public Restaurante() {
		super();
	}
	public Restaurante(String nombre, String direccion, String ciudad, Gerente gerente) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.gerente = gerente;
	}
	
	// Getters y Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
}
