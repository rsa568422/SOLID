package org.formacion.mediator;

public class Telefono {

	private Mediator mediador;

	private boolean musicaOn = false;

	public void setMediador(Mediator mediador) {
		this.mediador = mediador;
	}

	public void recibeLlamada() {
		this.mediador.recibeLlamadaTelefono();
	}

	public void enciendeMusica() {
		musicaOn = true;
	}
	
	public void apagaMusica() {
		musicaOn = false;
	}
	
	public boolean musicaEncendida() {
		return musicaOn;
	}
}
