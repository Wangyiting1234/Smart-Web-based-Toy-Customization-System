package com.pro.pro.mapper;

import com.pro.pro.Entity.Address;
import com.pro.pro.Entity.Order;
import com.pro.pro.Entity.OrderItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@SpringBootTest
//@RunWith:run this unit test
@RunWith(SpringRunner.class)
public class OrderMapperTests {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void insertOrder(){
        Order order = new Order();

        order.setuserId(2);
        orderMapper.insertOrder(order);
    }
    @Test
    public void insertOrderItem(){
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(1);
        orderMapper.insertItem(orderItem);
    }


}
