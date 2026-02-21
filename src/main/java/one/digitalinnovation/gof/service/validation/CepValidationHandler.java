package one.digitalinnovation.gof.service.validation;

import org.springframework.stereotype.Component;
import one.digitalinnovation.gof.model.Cliente;

@Component
public class CepValidationHandler extends ClienteValidationHandler {

    @Override
    public void validar(Cliente cliente) {
        if (cliente.getEndereco() == null || cliente.getEndereco().getCep() == null) {
            throw new RuntimeException("CEP é obrigatório.");
        }
        super.validar(cliente);
    }
}