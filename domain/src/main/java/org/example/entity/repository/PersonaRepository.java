package org.example.entity.repository;

import org.example.entity.Persona;

import java.util.List;

public interface PersonaRepository {

    public List<Persona> findAll();
}
