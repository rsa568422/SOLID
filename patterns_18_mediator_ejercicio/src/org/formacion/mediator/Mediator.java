package org.formacion.mediator;

public class Mediator {

    private final Radio radio;

    private final Telefono telefono;

    public Mediator(Coche coche, Radio radio, Telefono telefono) {
        coche.setMediador(this);
        this.radio = radio;
        radio.setMediador(this);
        this.telefono = telefono;
        telefono.setMediador(this);
    }

    public void enciendeCoche() {
        this.radio.enciende();
        this.telefono.apagaMusica();
    }

    public void apagaCoche() {
        this.radio.apaga();
    }

    public void enciendeRadio() {
        this.telefono.apagaMusica();
    }

    public void recibeLlamadaTelefono() {
        this.radio.apaga();
    }

}
