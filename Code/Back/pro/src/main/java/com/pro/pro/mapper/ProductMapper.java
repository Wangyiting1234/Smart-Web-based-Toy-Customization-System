package com.pro.pro.mapper;

import com.pro.pro.Entity.Product;
import com.pro.pro.Entity.ProductImg;

import java.util.List;

public interface ProductMapper {
    List<Product> findHotBySales();
    Product findById(Integer product_id);
    List<Product> findByTime();
    List<ProductImg> findByProductId(Integer productId);

}
