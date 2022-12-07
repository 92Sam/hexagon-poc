package com.org.example.test;

import org.example.entity.Price;
import org.example.entity.repository.PriceRepository;
import org.example.usecase.PriceUseCaseImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = PriceIntegrationImplTest.class)
class PriceIntegrationImplTest {

    @InjectMocks
    private PriceUseCaseImpl priceUseCase;

    @Mock
    private PriceRepository priceRepository;

    private Price price;
    @BeforeEach
    public void initEach(){
        MockitoAnnotations.initMocks(this);
        price = new Price();
        price.setId(1L);
        price.setProductId(35455);
        price.setPriceRate(1);
        price.setApplicationStartDate("2020-06-14 00:00:00");
        price.setApplicationEndDate("2020-12-31 23:59:59");
        price.setFinalPriceRate(35.50);
    }

    @Test
    @DisplayName("Verificar que las propiedades no sean nulas")
    public void ValuesAreNotNull() {
        when(priceRepository.findPricesByCriteria(any(String.class),any(Integer.class),any(Integer.class))).thenReturn(Arrays.asList(price));
        Price price = priceUseCase.findPricesByCriteria("2020-06-16 21:00:00",35455, 1);
        assertNotNull(price);
        assertNotNull(price.getProductId());
        assertNotNull(price.getPriceRate());
    }

    @Test
    @DisplayName("Verificar que el producto 35455 y la brand 1 no coinciden")
    public void valuesDoNotMatch() {
        when(priceRepository.findPricesByCriteria(any(String.class),any(Integer.class),any(Integer.class))).thenReturn(Arrays.asList(price));
        Price price = priceUseCase.findPricesByCriteria("2020-06-16 21:00:00",35455, 1);
        assertNotNull(price);
        assertNotEquals(price.getProductId(), 35457);
        assertNotEquals(price.getPriceRate(), 3);
    }

    @Test
    @DisplayName("petición a las 10:00 del día 14 del producto 35455   para la brand 1")
    public void firstTest() {
        when(priceRepository.findPricesByCriteria(any(String.class),any(Integer.class),any(Integer.class))).thenReturn(Arrays.asList(price));
        Price price = priceUseCase.findPricesByCriteria("2020-06-14 10:00:00",35455, 1);
        assertNotNull(price);
        assertEquals(price.getProductId(), 35455);
        assertEquals(price.getPriceRate(), 1);
    }

    @Test
    @DisplayName("petición a las 16:00 del día 14 del producto 35455   para la brand 1")
    public void secondtTest() {
        when(priceRepository.findPricesByCriteria(any(String.class),any(Integer.class),any(Integer.class))).thenReturn(Arrays.asList(price));
        Price price = priceUseCase.findPricesByCriteria("2020-06-14 16:00:00",35455, 1);
        assertNotNull(price);
        assertEquals(price.getProductId(), 35455);
        assertEquals(price.getPriceRate(), 1);
    }

    @Test
    @DisplayName("petición a las 21:00 del día 14 del producto 35455   para la brand 1")
    public void thirdTest() {
        when(priceRepository.findPricesByCriteria(any(String.class),any(Integer.class),any(Integer.class))).thenReturn(Arrays.asList(price));
        Price price = priceUseCase.findPricesByCriteria("2020-06-14 11:00:00",35455, 1);
        assertNotNull(price);
        assertEquals(price.getProductId(), 35455);
        assertEquals(price.getPriceRate(), 1);
    }

    @Test
    @DisplayName(" petición a las 10:00 del día 15 del producto 35455   para la brand 1")
    public void fourthTest() {
        when(priceRepository.findPricesByCriteria(any(String.class),any(Integer.class),any(Integer.class))).thenReturn(Arrays.asList(price));
        Price price = priceUseCase.findPricesByCriteria("2020-06-15 10:00:00",35455, 1);
        assertNotNull(price);
        assertEquals(price.getProductId(), 35455);
        assertEquals(price.getPriceRate(), 1);
    }

    @Test
    @DisplayName("petición a las 21:00 del día 16 del producto 35455   para la brand 1")
    public void fifthTest() {
        when(priceRepository.findPricesByCriteria(any(String.class),any(Integer.class),any(Integer.class))).thenReturn(Arrays.asList(price));
        Price price = priceUseCase.findPricesByCriteria("2020-06-16 21:00:00",35455, 1);
        assertNotNull(price);
        assertEquals(price.getProductId(), 35455);
        assertEquals(price.getPriceRate(), 1);
    }
}