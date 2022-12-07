package org.example.entity.repository;

import org.example.entity.Price;

import java.util.List;

public interface PriceRepository {

    List<Price> findPricesByCriteria(String applicationStartDate, Integer productId, Integer brandId);
}
