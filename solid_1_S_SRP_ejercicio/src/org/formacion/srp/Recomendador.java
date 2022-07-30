package org.formacion.srp;

import java.util.LinkedList;
import java.util.List;

public class Recomendador {

	public List<Pelicula> recomendaciones (Cliente cliente) {
		
		List<Pelicula> recomendadas = new LinkedList<>();
		
		for (Pelicula favorita: cliente.getFavoritas()) {
			recomendadas.addAll(BBDD.PELIS_POR_DIRECTOR.get(favorita.getDirector()));
		}

		recomendadas.removeAll(cliente.getFavoritas());
		
		return recomendadas;
	}

	public String recomendacionesCSV (Cliente cliente) {
		return Utilidad.toCSV(recomendaciones(cliente));
	}

}
