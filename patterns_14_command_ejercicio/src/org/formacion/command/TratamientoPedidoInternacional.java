package org.formacion.command;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    private final PedidoInternacional pedido;

    public TratamientoPedidoInternacional(PedidoInternacional pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean tratar() {
        return !"Mordor".equals(pedido.getDestino());
    }
}
