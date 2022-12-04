package org.example.controller;
 
import org.example.dto.PriceDTO;
import org.example.usecase.PriceUseCase;
import org.example.mapper.PriceMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PriceController {
    
    private PriceUseCase priceUseCase;

    public PriceController(PriceUseCase priceUseCase) {
        this.priceUseCase = priceUseCase;
    }

    @GetMapping("/prices")
    public ResponseEntity<PriceDTO> getPrice(
            @RequestParam(value = "applicationStartDate", required = true) String applicationStartDate,
            @RequestParam(value = "productId", required = true) Integer productId, 
            @RequestParam(value = "brandId", required = true) Integer brandId) {
        return new ResponseEntity<PriceDTO>(PriceMapper.pricemapper.asPrice(priceUseCase.findPricesByCriteria(applicationStartDate, productId, brandId)), HttpStatus.OK);
    }    
}
