package org.formacion.chain;

public class LectorPdf implements LectorDocumentos {

	@Override
	public String contenido(Documento documento) {
		if (formatoCompatible(documento))
			return "pdf " + documento.getContenido();
		else
			return "desconocido";
	}

	@Override
	public Boolean formatoCompatible(Documento documento) {
		return "pdf".equals(documento.getTipo());
	}

}