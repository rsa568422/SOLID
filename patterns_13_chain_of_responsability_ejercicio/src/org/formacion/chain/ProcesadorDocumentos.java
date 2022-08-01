package org.formacion.chain;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ProcesadorDocumentos {

	private final List<LectorDocumentos> lectores;

	public ProcesadorDocumentos() {
		this.lectores = Arrays.asList(new LectorDoc(), new LectorOdt(), new LectorPdf());
	}
	
    public ProcesadorDocumentos(List<LectorDocumentos> lectores) {
		this.lectores = lectores;
	}

	public String concatena (List<Documento> documentos)  {
		StringBuilder contenidos = new StringBuilder();

		documentos.forEach(documento -> {
			String contenido = this.lectores
					.stream()
					.filter(lector -> lector.formatoCompatible(documento))
					.map(lector -> lector.contenido(documento))
					.findAny()
					.orElse("desconocido");
			contenidos.append(contenido.concat("\n"));
		});

		return contenidos.toString();
    }

}
