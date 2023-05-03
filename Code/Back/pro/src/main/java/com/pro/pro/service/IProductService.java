package com.pro.pro.service;

import com.pro.pro.Entity.Product;
import com.pro.pro.Entity.ProductImg;

import java.util.List;

public interface IProductService {
    List<Product> findHotBySales();

    Product findById(Integer productId);

    List<Product> findByTime();
    List<ProductImg> findByProductId(Integer productId);
}
