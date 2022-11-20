package org.example;


import org.example.dto.PersonaDto;
import org.example.entity.Persona;
import org.example.usecase.FindAllPersonaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.example.mapper.PersonaMapper.personaMapper;

@RestController
public class HelloController {
    
    @Autowired
    private FindAllPersonaUseCase findAllPersonaUseCase;
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello world......";
    }
    
     @GetMapping("/persons")
    public ResponseEntity<List<PersonaDto>> findAll(){
        return new ResponseEntity<List<PersonaDto>>(personaMapper.PersonaToPersonaDto(findAllPersonaUseCase.findAll()), HttpStatus.OK);
    }
}
