package com.pro.pro.service;



import com.pro.pro.Entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
//@RunWith:run this unit test
@RunWith(SpringRunner.class)
public class OrderServiceTests {
    @Autowired
    private IOrderService OrderService;
   @Test
   public void insert(){
       Order order= new Order();


       OrderService.create(18,9,"15604781332", 378L);

   }


}
