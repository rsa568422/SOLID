package org.formacion.facade;

public class FacadeImpl implements Facade {

    private final ServicioConfiguracion configuracion;

    private final ServicioComunicacion comunicacion;

    private final ServicioFidelizacion fidelizacion;

    public FacadeImpl() {
        this.comunicacion = new ServicioComunicacion();
        this.configuracion = new ServicioConfiguracion();
        this.fidelizacion = new ServicioFidelizacion();
    }

    @Override
    public void setPreferencias(String cliente, PreferenciasComunicacion preferencias) {
        this.comunicacion.setPreferencias(cliente, preferencias);
    }

    @Override
    public void addEmail(String cliente, String email) {
        this.configuracion.addEmail(cliente, email);
    }

    @Override
    public void crearTarjeta(String cliente, ServicioFidelizacion.Tipo tipo) {
        this.fidelizacion.crearTarjeta(cliente, tipo);
    }

}
