package com.pro.pro.service;

import com.pro.pro.Entity.Address;

import java.util.List;

public interface IAddressService {
    void addNewAddress(Integer userId, String userTel, Address address);
    List<Address> getByUserId(Integer userId);
    void setDefault(Integer addId, Integer userId, String userTel);
    void deleteAddress(Integer addId, Integer userId);
    void updateAddress(Integer addId, String userTel,Integer userId,Address address);
    Address getUserId(Integer addId,Integer userId);
}
