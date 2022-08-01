package org.formacion.abstractfactory;

public class FactoryEn implements Factory {
    @Override
    public Preguntas obtenerPreguntas() {
        return new PreguntasEn();
    }

    @Override
    public Saludos obtenerSaludos() {
        return new SaludosEn();
    }
}
