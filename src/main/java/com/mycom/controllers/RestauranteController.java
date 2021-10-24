/**
 * 
 */
package com.mycom.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.mycom.entity.Restaurante;
import com.mycom.services.RestauranteService;

/**
 * @author VintageStep
 * Esta clase se encarga de cargar la información que va a ir a la página principal.
 */

@ManagedBean
@ViewScoped
public class RestauranteController {
	
	//Atributos - Lista de restuarantes para la tabla
	
	private List<Restaurante> restaurantes;
	
		// Información de la capa de servicios o lógica de negocio que vamos a llevar a la lista anterior
	private RestauranteService restauranteService = new RestauranteService();
	
	//Reemplazo del constructor
	
	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
	}
	
	// Métodos propiod: Método que llena la lista que va a la página XHTML
	
	public void consultarRestaurantes() {
		this.restaurantes = restauranteService.consultarRestaurantes();
	}
	
	// Getters y Setters del parámetro que se consulta en la página XHTML

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

}
