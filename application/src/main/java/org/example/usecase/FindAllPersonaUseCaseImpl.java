package org.example.usecase;

import org.example.entity.Persona;
import org.example.entity.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllPersonaUseCaseImpl implements FindAllPersonaUseCase {
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }
}
