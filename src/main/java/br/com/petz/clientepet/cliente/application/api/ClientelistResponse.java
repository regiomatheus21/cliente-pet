package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ClientelistResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;

    public static List<ClientelistResponse> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClientelistResponse::new)
                        .collect(Collectors.toList());
    }
    private ClientelistResponse (Cliente cliente){
        super();
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.celular=cliente.getCelular();
    }
}
