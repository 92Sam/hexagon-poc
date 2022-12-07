package org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface PriceDataRepository extends JpaRepository<PriceEntity, Long> {
    @Query(value = "SELECT ID, PRODUCT_ID, BRAND_ID, PRICE_LIST, START_DATE, END_DATE, PRICE, PRIORITY  FROM prices "
            + "WHERE  (?1 >= START_DATE AND ?1 <= END_DATE)  AND BRAND_ID=?3 AND PRODUCT_ID=?2 ", nativeQuery = true)
    public List<PriceEntity> findByApplicationStartDateWithProductIdAndBrandId(String applicationStartDate, Integer productId, Integer brandId);
}
