package com.pro.pro.service;


import com.pro.pro.Entity.Order;
import com.pro.pro.Entity.OrderItem;

import java.util.List;

public interface IOrderService {
    Order create(Integer addId, Integer userId,String userTel,Long price);
    OrderItem insertItem(Integer productId, String size, String color, Integer Num);
//    void setDefault(Integer addId, Integer userId, String userTel);
//    void deleteAddress(Integer addId, Integer userId);
//    void updateAddress(Integer addId, String userTel,Integer userId,Address address);
}
