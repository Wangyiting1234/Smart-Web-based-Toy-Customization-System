package com.pro.pro.mapper;

import com.pro.pro.Entity.Address;
import com.pro.pro.Entity.ProductParam;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/** delivery address Persistence Layer* */
public interface ProductParamMapper {

    List<ProductParam> findByProductId(Integer productId);
    ProductParam findBySizeColorAndProductId(Integer productId,String size,String color);

}
