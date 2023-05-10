package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.PetResponse;
import br.com.petz.clientepet.pet.application.api.petRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class PetApplicationService implements PetService{
    @Override
    public PetResponse criaPet(UUID idCliente, petRequest petRequest) {
        log.info(("[start]- PetApplicationService - criaPet"));

        log.info(("[finish]- PetApplicationService - criaPet"));
        return null;
    }
}
