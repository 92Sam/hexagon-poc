package org.example.usecase;

import org.example.entity.Price;

public interface PriceUseCase {
    Price findPricesByCriteria(String applicationStartDate, Integer productId, Integer brandId);
    
}
