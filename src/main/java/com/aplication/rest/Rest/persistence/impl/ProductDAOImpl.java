package com.aplication.rest.Rest.persistence.impl;

import com.aplication.rest.Rest.entities.Product;
import com.aplication.rest.Rest.persistence.IProductDAO;
import com.aplication.rest.Rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class ProductDAOImpl implements IProductDAO {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> finByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findProductByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
