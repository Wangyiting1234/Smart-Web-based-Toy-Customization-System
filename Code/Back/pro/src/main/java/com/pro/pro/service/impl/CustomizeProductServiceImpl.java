package com.pro.pro.service.impl;

import com.pro.pro.Entity.CustomizeProduct;
import com.pro.pro.Entity.Product;
import com.pro.pro.mapper.CustomizeProductMapper;
import com.pro.pro.mapper.ProductMapper;
import com.pro.pro.service.ICustomizeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomizeProductServiceImpl implements ICustomizeProductService {
    @Autowired
    private CustomizeProductMapper customizeProductMapper;

    @Override
    public List<CustomizeProduct> findProduct() {
        List<CustomizeProduct> list = customizeProductMapper.findProduct();
        return list;
    }

    @Override
    public List<Integer> findParentId() {
        List<CustomizeProduct> list = customizeProductMapper.findParentId();
        List<Integer> parent = new ArrayList<>();
        for(CustomizeProduct product:list){

            if(!parent.contains(product.getParentId())){
                parent.add(product.getParentId());
            }
        }
        return parent;
    }
//    @Override
//    public Product findById(Integer productId){
//        Product result = productMapper.findById(productId);
//        return result;
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
