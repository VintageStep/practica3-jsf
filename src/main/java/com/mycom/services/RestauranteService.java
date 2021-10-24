/**
 * 
 */
package com.mycom.services;

import java.util.ArrayList;
import java.util.List;

import com.mycom.entity.Gerente;
import com.mycom.entity.Restaurante;

/**
 * @author VintageStep
 * A falta de integración con una BBDD, vamos a simular una carga de datos con esta clase.
 */
public class RestauranteService {
	
	//Método que permite consultar la lista de restaurantes.
	
	public List<Restaurante> consultarRestaurantes(){
		
		// Instanciar la lista de Restaurantes
		
		List<Restaurante> restaurantes = new ArrayList<>();
		
		// Datos de la lista
		
		Gerente gerente1 = new Gerente("Maria","Lozano","Garcia");
		Gerente gerente2 = new Gerente("Francisco","Fernandez","Hidalgo");
		Gerente gerente3 = new Gerente("Patricia","Dominguez","Cabos");
		Gerente gerente4 = new Gerente("Hernando","Gutierrez","Sanz");
		Gerente gerente5 = new Gerente("Natalia","Garcia","Herrero");
		
		Restaurante restaurante1 = new Restaurante("Pizzeria Toto","Calle Alcalá 113","Madrid",gerente1);
		Restaurante restaurante2 = new Restaurante("Casa Francisco","Plaza España 4","Valladolid",gerente2);
		Restaurante restaurante3 = new Restaurante("La Crepêrie","Calle Tráfico 22","Granada",gerente3);
		Restaurante restaurante4 = new Restaurante("Hamburguers XXXL","Calle Baco 31","Barcelona",gerente4);
		Restaurante restaurante5 = new Restaurante("Carpe Diem","Calle Aramada 11","Madrid",gerente5);
		
		restaurantes.add(restaurante1);
		restaurantes.add(restaurante2);
		restaurantes.add(restaurante3);
		restaurantes.add(restaurante4);
		restaurantes.add(restaurante5);
		
		return restaurantes;
	}

}
