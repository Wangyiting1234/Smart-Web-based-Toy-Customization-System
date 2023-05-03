package com.pro.pro.service;

import com.pro.pro.Entity.Address;
import com.pro.pro.Entity.Cart;

import java.util.List;

public interface ICartService {
    void addNewCart(Integer userId, Integer productId, Integer productNum, String size, String color,String userTel);
    List<Cart> getByUserId(Integer userId);
//    void setDefault(Integer addId, Integer userId, String userTel);
//    void deleteAddress(Integer addId, Integer userId);
//    void updateAddress(Integer addId, String userTel,Integer userId,Address address);
}
