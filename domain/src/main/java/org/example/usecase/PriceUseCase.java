package org.example.usecase;

import org.example.entity.Price;

import java.util.List;

public interface PriceUseCase {
    Price findPricesByCriteria(String applicationStartDate, Integer productId, Integer brandId);
    
}
