package org.formacion.chain;

public class LectorOdt implements LectorDocumentos {

	@Override
	public String contenido(Documento documento) {
		if (formatoCompatible(documento))
			return "odt " + documento.getContenido();
		else
			return "desconocido";
	}

	@Override
	public Boolean formatoCompatible(Documento documento) {
		return "odt".equals(documento.getTipo());
	}

}