package com.pro.pro.mapper;

import com.pro.pro.Entity.Cart;
import com.pro.pro.Entity.Order;
import com.pro.pro.Entity.OrderItem;

import java.util.Date;
import java.util.List;

/** delivery address Persistence Layer* */
public interface OrderMapper {
    /**
     * insert new product for users
     *
     * @param order data of address
     * @return the effected row
     */
    Integer insertOrder(Order order);
    Integer insertItem(OrderItem orderItem);

}

