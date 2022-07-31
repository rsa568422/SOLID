package org.formacion.proxy;

public class CuentaSinCredito implements Cuenta {

    private final Cuenta cuenta;

    public CuentaSinCredito(String cliente) {
        this.cuenta = new CuentaNormal(cliente);
    }

    @Override
    public String getCliente() {
        return this.cuenta.getCliente();
    }

    @Override
    public int getCantidad() {
        return this.cuenta.getCantidad();
    }

    @Override
    public void movimiento(int importe) {
        if (this.cuenta.getCantidad() + importe >= 0) {
            this.cuenta.movimiento(importe);
        }
    }
}
