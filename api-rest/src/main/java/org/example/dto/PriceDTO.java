package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriceDTO {

    private Integer productId;
    private Integer brandId;
    private Integer priceRate;
    private String applicationStartDate;
    private String applicationEndDate;
    private Double finalPriceRate;
}
