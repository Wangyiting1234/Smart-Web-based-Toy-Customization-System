package com.pro.pro.service.impl;


import com.pro.pro.Entity.*;
import com.pro.pro.mapper.*;
import com.pro.pro.service.IAddressService;
import com.pro.pro.service.ICartService;
import com.pro.pro.service.IOrderService;
import com.pro.pro.service.IProductService;
import com.pro.pro.service.ex.InsertException;
import com.pro.pro.service.ex.UpdateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IAddressService addressService ;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private ICartService cartService;
    @Autowired
    private IProductService productService;
    private Integer orderId;
    @Override
    public Order create(Integer addId, Integer userId,String userTel,Long price) {
//
        Address address = addressService.getUserId(addId, userId);
        Order order = new Order();
        order.setuserId(userId);
        order.setReceiverName(address.getreceiverName());
        order.setReceiverPhone(address.getreceiverPhone());
        order.setProvince(address.getProvince());
        order.setArea(address.getArea());
        order.setCity(address.getCity());
        order.setAddress(address.getAddress());
        order.setStatus(0);
        order.setTotalAmount(price);

        order.setcreateUser(userTel);
        order.setcreateTime(new Date());
        order.setupdateTime(new Date());
        order.setupdateUser(userTel);
        order.setOrderTime(new Date());
        Integer rows = orderMapper.insertOrder(order);
        if(rows!=1){
            throw new InsertException("Generate exception while inserting new order");
        }
        orderId=order.getOrder_id();
        return order;
    }

    @Override
    public OrderItem insertItem(Integer productId, String size, String color, Integer Num) {
        OrderItem item = new OrderItem();
        item.setOrderId(orderId);
        item.setProductColor(color);
        item.setProductSize(size);
        item.setProductNum(Num);
        item.setProductId(productId);
        Product product = productService.findById(productId);
        item.setProductName(product.getproductName());
        Integer rows= orderMapper.insertItem(item);
        if(rows!=1){
            throw new InsertException("Generate exception while inserting new order");
        }


        return item;
    }
//    @Override
//    public void addNewCart(Integer userId, Integer productId, Integer productNum,String size, String color, String userTel) {
//        Cart result = cartMapper.findByUIdAndPid(productId,userId);
//        if(result!=null){//product was in cart
////            Integer num = productNum+reult.get
//            Integer row =  cartMapper.updateNumById(result.getCart_id(),productNum,userTel,new Date());
//            if(row!=1){
//                throw new UpdateException("Generate updating error while updating the number of product");
//            }
//        }else{//product was not in cart
//            Cart cart  = new Cart();
//            Product product = productMapper.findById(productId);
//            ProductParam productParam = productParamMapper.findBySizeColorAndProductId(productId,size,color);
//            cart.setProductName(product.getproductName());
//            cart.setUserId(userId);
//            cart.setProductNum(productNum);
//            cart.setProductId(productId);
//            cart.setcreateUser(userTel);
//            cart.setProductSize(size);
//            cart.setProductColor(color);
//            cart.setcreateTime(new Date());
//            cart.setupdateTime(new Date());
//            cart.setupdateUser(userTel);
//            cart.setProductPrice(productParam.getPrice());
//            Integer rows  = cartMapper.insert(cart);
//            if(rows!=1){
//                throw new InsertException("Generate insert error while inserting new cart");
//            }
//        }
//
//    }
//
//    @Override
//    public List<Cart> getByUserId(Integer userId) {
//        List<Cart> list = cartMapper.findByUid(userId);
//       for(Cart cart:list){
//            cart.setupdateUser(null);
//            cart.setupdateTime(null);
//            cart.setcreateUser(null);
//            cart.setcreateTime(null);
//
//       }
//        return list;
//    }


}
