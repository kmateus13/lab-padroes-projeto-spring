package one.digitalinnovation.gof.service.validation;

import org.springframework.stereotype.Component;
import one.digitalinnovation.gof.model.Cliente;

@Component
public class NomeValidationHandler extends ClienteValidationHandler {

    @Override
    public void validar(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new RuntimeException("Nome é obrigatório.");
        }
        super.validar(cliente);
    }
}