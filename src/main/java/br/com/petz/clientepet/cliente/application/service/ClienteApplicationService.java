package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClientelistResponse;
import br.com.petz.clientepet.cliente.application.repository.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;
    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest){
       log.info("[inicia] ClienteApplicationService - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteApplicationService - criaCliente");
        return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
    }

    @Override
    public List<ClientelistResponse> buscaTodosClientes() {
        log.info("[inicia] ClienteApplicationService - buscaTodosClientes ");
        List<Cliente> clientes =clienteRepository.buscaTodosClientes();
        log.info("[Finaliza] ClienteApplicationService - buscaTodosClientes ");

        return ClientelistResponse.converte(clientes);
    }

    @Override
    public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId ");
        Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
        log.info("[Finaliza] ClienteApplicationService - buscaClienteAtravesId ");
        return new ClienteDetalhadoResponse(cliente);
    }


}
