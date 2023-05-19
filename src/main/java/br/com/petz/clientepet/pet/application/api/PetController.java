package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.application.service.PetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
@RestController
@RequiredArgsConstructor
@Log4j2
public class PetController implements PetAPI {
    private final PetService petService;
    @Override
    public PetResponse postPet(UUID idCliente, petRequest petRequest) {
        log.info("[inicia] PetController - postPet");
        log.info("[idCliente]{}",idCliente);
        PetResponse pet = petService.criaPet(idCliente,petRequest);
        log.info("[finaliza] PetController - postPet");
        return pet;
    }

    @Override
    public List<PetClienteListResponse> getPetsDoClienteComID(UUID idCliente) {
        log.info("[inicia] PetController - getPetsDoClienteComID");
        log.info("[idCliente]{}",idCliente);
        List<PetClienteListResponse> petsDoCliente = petService.buscaPetsDoClienteComID(idCliente);
        log.info("[finaliza] PetController - getPetsDoClienteComID");
        return petsDoCliente;
    }
}
