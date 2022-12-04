package org.example.usecase;


import org.example.entity.Price;
import org.example.entity.repository.PriceRepository;
import org.example.exception.PriceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PriceUseCaseImpl implements PriceUseCase {
    
    @Autowired
    private PriceRepository priceRepository;
    
    @Override
    public Price findPricesByCriteria(String applicationStartDate, Integer productId, Integer brandId) {
        List<Price> prices =  priceRepository.findPricesByCriteria(applicationStartDate, productId, brandId);
        if(prices.isEmpty()){ throw new PriceNotFoundException("Record not found.");}
        Collections.sort(prices, (o1, o2) -> o1.getPriority().compareTo(o2.getPriority()));
        return prices.get(0);
    }
}
