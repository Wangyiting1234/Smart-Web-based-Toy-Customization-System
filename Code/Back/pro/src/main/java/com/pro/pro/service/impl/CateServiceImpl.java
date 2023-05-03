package com.pro.pro.service.impl;

import com.pro.pro.Entity.Address;
import com.pro.pro.Entity.Cate;
import com.pro.pro.mapper.AddressMapper;
import com.pro.pro.mapper.CateMapper;
import com.pro.pro.service.IAddressService;
import com.pro.pro.service.ICateService;
import com.pro.pro.service.ex.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CateServiceImpl implements ICateService {
    @Autowired
    private CateMapper cateMapper;

    @Override
    public List<Cate> getCateName() {
        List result = cateMapper.findCate();
        return result;
    }

//    @Override
//    public void addNewAddress(Integer userId, String userTel, Address address) {
//        Integer result = addressMapper.countByUserId(userId);
//        if(result>maxCount){
//            throw new AddressCountLimitException("the number of address more than 20");
//        }
//        address.setuserId(userId);
//        Integer isDefault = result==0?1:0;//1:default 0:not default
//        address.setisDefault(isDefault);
//        address.setcreateTime(new Date());
//        address.setcreateUser(userTel);
//        address.setupdateUser(userTel);
//        address.setupdateTime(new Date());
//        Integer rows = addressMapper.insert(address);
//        if(rows!=1){
//            throw new InsertException("Generate exception when inserting delivery address");
//        }
//    }
//
//    @Override
//    public List<Address> getByUserId(Integer userId) {
//       List<Address> list = addressMapper.findByUserId(userId);
//       for(Address address:list){
//           address.setuserId(null);
//           address.setpostCode(null);
//           address.setcreateUser(null);
//           address.setcreateTime(null);
//           address.setupdateUser(null);
//           address.setupdateTime(null);
//
//       }
//       return list;
//    }
//
//    @Override
//    public void setDefault(Integer addId, Integer userId, String userTel) {
//        Address result = addressMapper.findByAddressId(addId);
//        if(result==null){
//            throw new AddressNotFound("address is not found");
//        }
//        if(!result.getuserId().equals(userId)){
//            throw new AccessDeniedException("illegal data visits");
//        }
//        Integer rows = addressMapper.updateNoneDefault(userId);
//        if(rows<1){
//            throw new UpdateException("Generate error while updating default address");
//        }
//        Integer row = addressMapper.updateDefaultByUserId(addId,userTel,new Date());
//        if(row!=1){
//            throw new UpdateException("Generate error while updating default address");
//        }
//    }
//
//    @Override
//    public void deleteAddress(Integer addId,Integer userId) {
//        Address result = addressMapper.findByAddressId(addId);
//        if(result==null){
//            throw new AddressNotFound("address is not found");
//        }
//        if(!result.getuserId().equals(userId)){
//            throw new AccessDeniedException("illegal data visits");
//        }
//        Integer rows= addressMapper.deleteByAddId(addId);
//        if(rows!=1){
//            throw new DeleteException("Generate error while deleting address");
//        }
//
//    }
//
//    @Override
//    public void updateAddress(Integer addId,String userTel,Integer userId, Address address) {
//        Address result = addressMapper.findByAddressId(addId);
//        if(result==null){
//            throw new AddressNotFound("address is not found");
//        }
//        if(!result.getuserId().equals(userId)){
//            throw new AccessDeniedException("illegal data visits");
//        }
//        Integer rows = addressMapper.updateByAddId(addId,userId,address.getreceiverName(),address.getreceiverPhone()
//        ,address.getProvince(),address.getCity(),address.getArea(),address.getAddress(),address.getpostCode(),address.getisDefault(),
//                userTel,new Date());
//        if(rows!=1){
//            throw new UpdateException("Generate error while updating address information");
//        }
//    }

}
