package com.udacity.pricingservice;

import com.netflix.discovery.converters.Auto;
import com.udacity.pricingservice.domain.Price;
import com.udacity.pricingservice.repository.PriceRepository;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PriceRepositoryIntegrationTests {

    @Autowired
    private PriceRepository priceRepository;

    @Test
    public void findAllPrices() {
        List<Price> priceList = (List<Price>) priceRepository.findAll();
        assertNotNull(priceList);
    }
}
