package org.example.repository;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "prices")
public class PriceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Column(name = "PRODUCT_ID")
    private Integer productId;
    @Column(name = "BRAND_ID")
    private Integer brandId;
    @Column(name = "PRICE_LIST")
    private Integer priceRate;
    @Column(name = "START_DATE")
    private String applicationStartDate;
    @Column(name = "END_DATE")
    private String applicationEndDate;
    @Column(name = "PRICE")
    private Double finalPriceRate;
    @Column(name = "PRIORITY")
    private Integer priority;
}
