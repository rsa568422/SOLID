package org.formacion.mediator;

public class Coche {

	private Mediator mediador;

	public void setMediador(Mediator mediador) {
		this.mediador = mediador;
	}

	public void enciende() {
		this.mediador.enciendeCoche();
	}
	
	public void apaga() {
		this.mediador.apagaCoche();
	}
	
}
