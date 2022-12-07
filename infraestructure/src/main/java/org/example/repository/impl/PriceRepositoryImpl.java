package org.example.repository.impl;


import org.example.entity.Price;
import org.example.entity.repository.PriceRepository;
import org.example.repository.PriceDataRepository;
import org.example.repository.PriceEntity;
import org.example.mapper.PriceEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PriceRepositoryImpl implements PriceRepository {

    @Autowired
    private PriceDataRepository priceDataRepository;


    
    @Override
    public List<Price> findPricesByCriteria(String applicationStartDate, Integer productId, Integer brandId) {
        List<PriceEntity> prices = priceDataRepository.findByApplicationStartDateWithProductIdAndBrandId(applicationStartDate, productId, brandId);
        return PriceEntityMapper.priceMapper.asPrice(prices);
    }
}
