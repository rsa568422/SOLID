package org.formacion.abstractfactory;

public class FactoryEs implements Factory {
    @Override
    public Preguntas obtenerPreguntas() {
        return new PreguntasEs();
    }

    @Override
    public Saludos obtenerSaludos() {
        return new SaludosEs();
    }
}
