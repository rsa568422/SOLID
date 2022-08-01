package org.formacion.chain;

public class LectorDoc implements LectorDocumentos {

	@Override
	public String contenido(Documento documento) {
		if (formatoCompatible(documento))
			return "doc " + documento.getContenido();
		else
			return "desconocido";
	}

	@Override
	public Boolean formatoCompatible(Documento documento) {
		return "doc".equals(documento.getTipo());
	}

}
