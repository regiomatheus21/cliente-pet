package br.com.petz.clientepet.cliente.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cliente") // é v1 pois é a primeira versão da api cliente.
public interface ClienteAPI {
    // aqui onde vamos mapear a parte do crud.
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);


}
