package com.aplication.rest.Rest.persistence;

import com.aplication.rest.Rest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductDAO {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    List<Product> finByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
    void save(Product product);
    void deleteById(Long id);
}
