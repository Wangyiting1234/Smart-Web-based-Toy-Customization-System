package com.pro.pro.mapper;

import com.pro.pro.Entity.CustomizeProduct;
import com.pro.pro.Entity.Product;

import java.util.List;

public interface CustomizeProductMapper {
    public List<CustomizeProduct> findProduct();
    public List<CustomizeProduct> findParentId();


}
