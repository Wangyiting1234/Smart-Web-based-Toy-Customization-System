package com.pro.pro.service;

import com.pro.pro.Entity.ProductParam;

import java.util.List;

public interface IProductParamService {
    List<ProductParam> findById(Integer productId);

////    List<Product> findById();
//
//    List<Product> findByTime();
}
