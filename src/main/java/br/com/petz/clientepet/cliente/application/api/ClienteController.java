package br.com.petz.clientepet.cliente.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
import br.com.petz.clientepet.cliente.application.service.ClienteService;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI{
    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest){
       log.info("[inicia] ClienteController - postCliente ");
       ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finaliza] ClienteController - postCliente");
        return clienteCriado;
    }

    @Override
    public List<ClientelistResponse> getTodosClientes() {
        log.info("[inicia] ClienteController - getTodosClientes");
        List<ClientelistResponse> clientes = clienteService.buscaTodosClientes();
        log.info("[Finaliza] ClienteController - getTodosClientes");
        return clientes;
    }

    @Override
    public ClienteDetalhadoResponse getClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteController - getClienteAtravesId ");
        log.info("[IdCliente] {}", idCliente);
        ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtravesId(idCliente);
        log.info("[Finaliza] ClienteController - getClienteAtravesId");
        return clienteDetalhado;
    }
    @Override
    public void deletaClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteController - deletaClienteAtravesId ");
        log.info("[IdCliente] {}", idCliente);
        clienteService.deletaClienteAtravesId(idCliente);
        log.info("[Finaliza] ClienteController - deletaClienteAtravesId ");

    }

    @Override
    public void patchAlteraCliente(UUID idCliente , @Valid ClienteAlteracaoRequest clienteAlteracaoRequest) {
        log.info("[inicia] ClienteController - patchAlteraCliente ");
        log.info("[IdCliente] {}", idCliente);
        clienteService.patchAlteraCliente(idCliente,clienteAlteracaoRequest);
        log.info("[Finaliza] ClienteController - patchAlteraCliente ");

    }

}
