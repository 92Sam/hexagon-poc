package org.example.mapper;

import org.example.dto.PriceDTO;
import org.example.entity.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {
    
    PriceMapper pricemapper = Mappers.getMapper(PriceMapper.class);
    PriceDTO asPrice(Price prices);
}
