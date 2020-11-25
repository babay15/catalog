package com.babay15.catalog.controller;

import com.babay15.catalog.dao.ProductDao;
import com.babay15.catalog.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/product")
public class ProductController {

    @Autowired private ProductDao productDao;

    @GetMapping("/")
    public Page<Product> products(Pageable pageable) {
        return productDao.findAll(pageable);
    }
}
