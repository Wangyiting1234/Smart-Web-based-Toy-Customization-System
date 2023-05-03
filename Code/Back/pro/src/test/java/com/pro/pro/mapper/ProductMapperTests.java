package com.pro.pro.mapper;


import com.pro.pro.Entity.Product;
import com.pro.pro.Entity.ProductImg;
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
public class ProductMapperTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void findByUserId(){
        List<Product> list=productMapper.findHotBySales();
        System.out.println(list);
    }
    @Test
    public void findByTime(){
        List<Product> list=productMapper.findByTime();

        System.out.println(list);
    }
    @Test
    public void findByProductId(){
        List<ProductImg> list = productMapper.findByProductId(4);
        System.out.println(list);
    }
//    public void findByAddId(){
//        System.out.print(addressMapper.findByAddressId(5));
//    }
//    @Test
//    public void updateNoneDefault(){
//        addressMapper.updateNoneDefault(14);
//    }
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
