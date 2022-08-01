package org.formacion.template;

public abstract class Inscripcion {

    private final Torneo torneo;

    private final Polideportivo polideportivo;

    protected Inscripcion(Torneo torneo, Polideportivo polideportivo) {
        this.polideportivo = polideportivo;
        this.torneo = torneo;
    }

    public Torneo getTorneo() {
        return this.torneo;
    }

    public Polideportivo getPolideportivo() {
        return this.polideportivo;
    }

    public abstract boolean apunta (Solicitud solicitud);

}
