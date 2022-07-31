package org.formacion.facade;

public interface Facade {

    void setPreferencias (String cliente, PreferenciasComunicacion preferencias);

    void addEmail(String cliente, String email);

    void crearTarjeta(String cliente, ServicioFidelizacion.Tipo tipo);

}
