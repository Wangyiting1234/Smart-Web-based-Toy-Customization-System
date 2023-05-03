package com.pro.pro.mapper;

import com.pro.pro.Entity.Address;
import com.pro.pro.Entity.Cart;
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
public class CartMapperTests {
    @Autowired
    private CartMapper cartMapper;
    @Test
    public void insert(){
        Cart cart = new Cart();
        cart.setUserId(3);
        cart.setProductId(1);
        cart.setProductColor("blue");
        cart.setupdateTime(new Date());
        cartMapper.insert(cart);
    }
//    @Test
//    public void countByUserId(){
//        Integer count = addressMapper.countByUserId(13);
//        System.out.println(count);
//    }
    @Test
    public void findByUIdAndPid(){
        Cart cart=cartMapper.findByUIdAndPid(10,14);
        System.out.println(cart);
    }
    @Test
    public void findByUid(){
        List<Cart> cart=cartMapper.findByUid(9);
        System.out.println(cart);
    }
    @Test
    public void findUid(){
        System.out.println(cartMapper.findUid(9));
    }

//    @Test
//    public void findByAddId(){
//        System.out.print(addressMapper.findByAddressId(5));
//    }
    @Test
    public void updateNumById(){
        cartMapper.updateNumById(1,2,"back",new Date());
    }
//    @Test
//    public void updateDefaultByUserId(){
//        addressMapper.updateDefaultByUserId(5,"back",new Date());
//    }
//    @Test
//    public void deleteByAddId(){
//        addressMapper.deleteByAddId(6);
//    }
//    @Test
//    public void updateByAddId(){
//        addressMapper.updateByAddId(4,9,"amy","1324322334","Beijing",
//                "beijing","dongcehng","adasda","029888",1,"back",new Date());
//    }

}
