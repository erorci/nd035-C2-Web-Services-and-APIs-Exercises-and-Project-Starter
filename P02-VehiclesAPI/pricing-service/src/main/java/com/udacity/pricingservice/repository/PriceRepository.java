package com.udacity.pricingservice.repository;

import com.udacity.pricingservice.domain.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
