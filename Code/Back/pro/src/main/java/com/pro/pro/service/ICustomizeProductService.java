package com.pro.pro.service;

import com.pro.pro.Entity.CustomizeProduct;
import com.pro.pro.Entity.Product;

import java.util.List;

public interface ICustomizeProductService {
    public List<CustomizeProduct> findProduct();
    public List<Integer> findParentId();

}
