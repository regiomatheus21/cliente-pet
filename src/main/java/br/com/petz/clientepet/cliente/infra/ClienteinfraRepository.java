package br.com.petz.clientepet.cliente.infra;

import br.com.petz.clientepet.cliente.application.repository.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import br.com.petz.clientepet.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteinfraRepository implements ClienteRepository {
    private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;
    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteinfraRepository - salva ");
        clienteSpringDataJPARepository.save(cliente);
        log.info("[finaliza] ClienteinfraRepository - salva ");
        return cliente;
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[inicia] ClienteinfraRepository - buscaTodosClientes  ");
        List<Cliente> todosClientes=clienteSpringDataJPARepository.findAll();
        log.info("[Finaliza] ClienteinfraRepository - buscaTodosClientes  ");
        return todosClientes;
    }

    @Override
    public Cliente buscaClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteinfraRepository - buscaClienteAtravesId   ");
        Cliente cliente = clienteSpringDataJPARepository.findByIdCliente(idCliente)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND,"Cliente não encontrado!"));
        log.info("[Finaliza] ClienteinfraRepository - buscaClienteAtravesId ");
        return cliente;
    }
}
