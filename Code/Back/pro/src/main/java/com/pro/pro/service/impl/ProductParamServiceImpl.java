package com.pro.pro.service.impl;

import com.pro.pro.Entity.Product;
import com.pro.pro.Entity.ProductParam;
import com.pro.pro.mapper.ProductMapper;
import com.pro.pro.mapper.ProductParamMapper;
import com.pro.pro.service.IProductParamService;
import com.pro.pro.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductParamServiceImpl implements IProductParamService {
    @Autowired
    private ProductParamMapper productParamMapper;

    @Override
    public List<ProductParam> findById(Integer productId) {
        List<ProductParam> list = productParamMapper.findByProductId(productId);
        return list;
    }

//    @Override
//    public List<Product> findById(){
//
//    }
//    @Override
//    public List<Product> findByTime() {
//        List<Product> list = productMapper.findByTime();
//        for(Product product:list){
//            product.setcreateTime(null);
//            product.setcreateUser(null);
//        }
//        return list;
//    }
}
