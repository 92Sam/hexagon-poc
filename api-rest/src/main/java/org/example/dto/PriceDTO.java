package org.example.dto;

import lombok.Data;
@Data
public class PriceDTO {

    private Integer productId;
    private Integer brandId;
    private Integer priceRate;
    private String applicationStartDate;
    private String applicationEndDate;
    private Double finalPriceRate;
}
