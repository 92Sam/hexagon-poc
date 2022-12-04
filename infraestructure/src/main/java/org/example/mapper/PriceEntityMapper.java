package org.example.mapper;

import org.example.entity.Price;
import org.example.repository.PriceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceEntityMapper {

    PriceEntityMapper priceMapper = Mappers.getMapper(PriceEntityMapper.class);
    List<Price> asPrice(List<PriceEntity> pricesEntity);
}
