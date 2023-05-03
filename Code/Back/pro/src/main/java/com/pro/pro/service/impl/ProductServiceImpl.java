package com.pro.pro.service.impl;

import com.pro.pro.Entity.Product;
import com.pro.pro.Entity.ProductImg;
import com.pro.pro.mapper.ProductMapper;
import com.pro.pro.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> findHotBySales() {
        List<Product> list = productMapper.findHotBySales();
        for(Product product:list){
            product.setcreateTime(null);
            product.setcreateUser(null);
            product.setupdateTime(null);
            product.setupdateUser(null);
        }
        return list;
    }
    @Override
    public Product findById(Integer productId){
        Product result = productMapper.findById(productId);
        return result;
    }
    @Override
    public List<Product> findByTime() {
        List<Product> list = productMapper.findByTime();
        for(Product product:list){
            product.setcreateTime(null);
            product.setcreateUser(null);
        }
        return list;
    }

    @Override
    public List<ProductImg> findByProductId(Integer productId) {
        List<ProductImg> list = productMapper.findByProductId(productId);

        return list;
    }
}
