package org.example.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.MimeTypeUtils;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// TODO comprobar en los tests que el resultado es el esperado, no solo que el estado es 200
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PriceControllerTest {
    @Autowired
    private MockMvc mockMvc;
    
    /*
     * applicationStartDate: 2020-06-14 10:00:00
     * productId: 35455
     * brandId: 1
     */
    @Test
    public void findByFirstCriteria() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders.get("/prices?applicationStartDate=2020-06-14 10:00:00&productId=35455&brandId=1")
                    .accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
            .andExpect(status().isOk())
            .andReturn();
    }

    /*
     * applicationStartDate: 2020-06-14 16:00:00
     * productId: 35455
     * brandId: 1
     */
    @Test
    public void findBySecondCriteria() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders.get("/prices?applicationStartDate=2020-06-14 16:00:00&productId=35455&brandId=1")
                        .accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();
    }

    /*
     * applicationStartDate: 2020-06-14 21:00:00
     * productId: 35455
     * brandId: 1
     */
    @Test
    public void findByThirdCriteria() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders.get("/prices?applicationStartDate=2020-06-14 21:00:00&productId=35455&brandId=1")
                        .accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();
    }

    /*
     * applicationStartDate: 2020-06-15 10:00:00
     * productId: 35455
     * brandId: 1
     */
    @Test
    public void findByFourthCriteria() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders.get("/prices?applicationStartDate=2020-06-15 10:00:00&productId=35455&brandId=1")
                        .accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();
    }

    /*
     * applicationStartDate: 2020-06-16 21:00:00
     * productId: 35455
     * brandId: 1
     */
    @Test
    public void findByFifthCriteria() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders.get("/prices?applicationStartDate=2020-06-16 21:00:00&productId=35455&brandId=1")
                        .accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();
    }
}
