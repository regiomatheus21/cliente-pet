package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/pet")
public interface PetAPI  {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PetResponse postPet(@PathVariable UUID idCliente,
                        @Valid @RequestBody petRequest petRequest);
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<PetClienteListResponse> getPetsDoClienteComID(@PathVariable UUID idCliente);
    @GetMapping(value = "/{idPet}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteDetalhadoResponse getClienteAtravesId(@PathVariable UUID idCliente,@PathVariable UUID idPet);


}
