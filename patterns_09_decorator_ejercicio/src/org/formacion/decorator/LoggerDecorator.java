package org.formacion.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

	private BaseDatos bbdd;

	private Logger logger;

	public LoggerDecorator(BaseDatos bbdd, Logger logger) {
		this.bbdd = bbdd;
		this.logger = logger;
	}

	@Override
	public void inserta(String registro) {
		this.logger.add("inserta entrada");
		this.bbdd.inserta(registro);
	}

	@Override
	public List<String> registros() {
		this.logger.add("lectura");
		return this.bbdd.registros();
	}

	

}
