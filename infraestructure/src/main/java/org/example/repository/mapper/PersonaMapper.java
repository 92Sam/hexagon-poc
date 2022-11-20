package org.example.repository.mapper;

import org.example.entity.Persona;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaMapper implements RowMapper<Persona> {
    @Override
    public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Persona.builder()
                .id(rs.getString("id"))
                .nombre(rs.getString("nombre"))
                .email(rs.getString("email"))
                .build();
    }
}
