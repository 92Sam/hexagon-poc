package org.example.repository.impl;

import org.example.entity.Persona;
import org.example.entity.repository.PersonaRepository;
import org.example.repository.mapper.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonaImpl implements PersonaRepository {
    
    @Autowired
    private NamedParameterJdbcTemplate template;
    
    @Override
    public List<Persona> findAll() {
       
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM persona");
        List<Persona> personas = template.query(sql.toString(), new PersonaMapper());
        return personas;
    }
}
