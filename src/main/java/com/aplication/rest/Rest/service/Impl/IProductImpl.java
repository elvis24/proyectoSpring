package com.aplication.rest.Rest.service.Impl;

import com.aplication.rest.Rest.entities.Product;
import com.aplication.rest.Rest.persistence.IProductDAO;


import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class IProductImpl implements IProductDAO {

    private IProductDAO productDAO;

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productDAO.findById(id);
    }

    @Override
    public List<Product> finByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productDAO.finByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productDAO.deleteById(id);
    }
}
