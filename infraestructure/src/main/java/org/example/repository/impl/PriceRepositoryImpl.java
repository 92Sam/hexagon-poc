package org.example.repository.impl;


import org.example.entity.Price;
import org.example.entity.repository.PriceRepository;
import org.example.repository.PriceEntity;
import org.example.mapper.PriceEntityMapper;
import org.example.mapper.PriceRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PriceRepositoryImpl implements PriceRepository {
    
    @Autowired
    private NamedParameterJdbcTemplate template;
    
    @Override
    public List<Price> findPricesByCriteria(String applicationStartDate, Integer productId, Integer brandId) {
        
        try {
            Map<String, Object> paramsMap = new HashMap<>();
            paramsMap.put("applicationStartDate", applicationStartDate);
            paramsMap.put("brandId", brandId);
            paramsMap.put("productId", productId);

            StringBuilder sql = new StringBuilder();
            sql.append(" SELECT PRODUCT_ID, BRAND_ID, PRICE_LIST, START_DATE, END_DATE, PRICE, PRIORITY ");
            sql.append(" FROM prices ");
            sql.append(" WHERE ");
            sql.append(" (:applicationStartDate >= START_DATE AND :applicationStartDate <= END_DATE) ");
            sql.append(" AND BRAND_ID=:brandId ");
            sql.append(" AND PRODUCT_ID=:productId ");

            List<PriceEntity> prices = template.query(sql.toString(), paramsMap, new PriceRowMapper());
            return PriceEntityMapper.priceMapper.asPrice(prices);
        } catch (DataAccessException e) {
            throw new org.example.exception.DataAccessException("Error de access a BD.");
        }
    }
}
