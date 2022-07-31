package org.formacion.mediator;

public class Radio {

	private Mediator mediador;

	private boolean encendida = false;

	public void setMediador(Mediator mediador) {
		this.mediador = mediador;
	}

	public void enciende() {
		this.encendida = true;
		this.mediador.enciendeRadio();
	}
	
	public void apaga() {
		encendida = false; 
	}
	
	public boolean encendida() {
		return encendida;
	}
}
