package org.formacion;

import java.util.Optional;

public class InternationalMoneyOrganizationAdapter extends BancoNostrumIml implements InternationalMoneyOrganization {

    @Override
    public void transfer(int cantidad, String cliente) {
        super.movimiento(cliente, cantidad);
    }

    @Override
    public int state(String cliente) {
        Optional<Integer> estado = Optional.ofNullable(super.estado(cliente));
        return estado.orElse(0);
    }
}
