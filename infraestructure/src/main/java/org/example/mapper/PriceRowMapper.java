package org.example.mapper;

import org.example.repository.PriceEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PriceRowMapper implements RowMapper<PriceEntity> {
    @Override
    public PriceEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return PriceEntity.builder()
                .productId(rs.getInt("PRODUCT_ID"))
                .brandId(rs.getInt("BRAND_ID"))
                .priceRate(rs.getInt("PRICE_LIST"))
                .applicationStartDate(rs.getString("START_DATE"))
                .applicationEndDate(rs.getString("END_DATE"))
                .finalPriceRate(rs.getDouble("PRICE"))
                .priority(rs.getInt("PRIORITY"))
                .build();
    }
}
