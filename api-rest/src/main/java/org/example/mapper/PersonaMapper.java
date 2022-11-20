package org.example.mapper;

import org.example.dto.PersonaDto;
import org.example.entity.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonaMapper {

    PersonaMapper personaMapper = Mappers.getMapper(PersonaMapper.class);

    List<PersonaDto> PersonaToPersonaDto(List<Persona> personas);
    
}
