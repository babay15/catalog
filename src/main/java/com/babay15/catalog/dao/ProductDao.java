package com.babay15.catalog.dao;

import com.babay15.catalog.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String> {
}
