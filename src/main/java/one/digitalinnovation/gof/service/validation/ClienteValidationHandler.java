package one.digitalinnovation.gof.service.validation;

import one.digitalinnovation.gof.model.Cliente;

public abstract class ClienteValidationHandler {

    protected ClienteValidationHandler next;

    public void setNext(ClienteValidationHandler next) {
        this.next = next;
    }

    public void validar(Cliente cliente) {
        if (next != null) {
            next.validar(cliente);
        }
    }
}