/**
 * 
 */
package com.mycom.entity;

import java.util.Objects;

/**
 * @author Vintagestep
 * Clase que representa la entidad de gerente.
 */
public class Gerente {

	//Atributos
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	
	//Constructores
	
	public Gerente() {
		super();
	}
	public Gerente(String nombre, String primerApellido, String segundoApellido) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}
	
	// Métodos sobrescritos

	@Override
	public int hashCode() {
		return Objects.hash(nombre, primerApellido, segundoApellido);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerente other = (Gerente) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(primerApellido, other.primerApellido)
				&& Objects.equals(segundoApellido, other.segundoApellido);
	}
	@Override
	public String toString() {
		return "Gerente [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + "]";
	}
	
	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
}
