package org.formacion.ocp;

import java.util.ArrayList;
import java.util.List;

public interface GeneradorPrimos {

	
	default List<Integer> primos (int limit) {
		
		List<Integer> primos = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}
		return primos;

	}
	
	default boolean esPrimo (int candidato) {
		for (int i = 2; i < candidato; i++) {
			if (candidato % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
