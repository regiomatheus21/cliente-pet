package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.PetClienteListResponse;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import br.com.petz.clientepet.pet.application.api.petRequest;

import java.util.List;
import java.util.UUID;

public interface PetService {

    PetResponse criaPet(UUID idCliente, petRequest petRequest);

    List<PetClienteListResponse> buscaPetsDoClienteComID(UUID idCliente);


    PetClienteListResponse buscaPetDoClienteComID(UUID idCliente, UUID idPet);
}
