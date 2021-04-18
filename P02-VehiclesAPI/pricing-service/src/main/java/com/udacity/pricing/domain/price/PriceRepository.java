package com.udacity.pricing.domain.price;

import org.springframework.data.repository.CrudRepository;


public interface PriceRepository extends CrudRepository<Long, Price> {

}
