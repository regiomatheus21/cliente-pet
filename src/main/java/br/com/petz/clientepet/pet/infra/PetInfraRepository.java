package br.com.petz.clientepet.pet.infra;


import br.com.petz.clientepet.pet.application.service.PetRepository;
import br.com.petz.clientepet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
    private final PetSpringDataJPARepository petSpringDataJPARepository;
    @Override
    public Pet salvaPet(Pet pet) {
       log.info("[śtart] PetInfraRepository - salvaPet");
       petSpringDataJPARepository.save(pet);
        log.info("[Finish] PetInfraRepository - salvaPet");
        return pet;
    }

    @Override
    public List<Pet> buscaPetsDoClienteComID(UUID idCliente) {
        log.info("[śtart] PetInfraRepository - buscaPetsDoClienteComID");
        var pets = petSpringDataJPARepository.findByidClienteTutor(idCliente);
        log.info("[Finish] PetInfraRepository - buscaPetsDoClienteComID");
        return pets;
    }
}
