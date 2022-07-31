package org.formacion.chain;

public interface LectorDocumentos {

	String contenido(Documento documento);

	Boolean formatoCompatible(Documento documento);

}
