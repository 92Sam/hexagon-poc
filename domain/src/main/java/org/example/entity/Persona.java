package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private String id;
    private String nombre;
    private  String email;
    
}

