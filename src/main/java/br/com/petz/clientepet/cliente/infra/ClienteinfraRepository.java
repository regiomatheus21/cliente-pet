package br.com.petz.clientepet.cliente.infra;

import br.com.petz.clientepet.cliente.application.repository.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteinfraRepository implements ClienteRepository {
    private final ClienteInfraJPARepository clienteInfraJPARepository;
    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteinfraRepository - salva ");
        Cliente cliente1 = clienteInfraJPARepository.save(cliente);
        log.info("[finaliza] ClienteinfraRepository - salva ");
        return cliente1;
    }
}
