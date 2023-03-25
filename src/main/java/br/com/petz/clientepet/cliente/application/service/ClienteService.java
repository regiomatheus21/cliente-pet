package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClientelistResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

    List<ClientelistResponse> buscaTodosClientes();

    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);

}
