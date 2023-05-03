package com.pro.pro.mapper;

import com.pro.pro.Entity.Address;
import com.pro.pro.Entity.User;
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
public class AddressMapperTests {
    @Autowired
    private AddressMapper addressMapper;
    @Test
    public void insert(){
        Address address = new Address();
        address.setuserId(14);
        address.setreceiverName("ahaha");
        addressMapper.insert(address);
    }
    @Test
    public void countByUserId(){
        Integer count = addressMapper.countByUserId(13);
        System.out.println(count);
    }
    @Test
    public void findByUserId(){
        List<Address> list=addressMapper.findByUserId(14);
        System.out.println(list);
    }
    @Test
    public void findByAddId(){
        System.out.print(addressMapper.findByAddressId(5));
    }
    @Test
    public void updateNoneDefault(){
        addressMapper.updateNoneDefault(14);
    }
    @Test
    public void updateDefaultByUserId(){
        addressMapper.updateDefaultByUserId(5,"back",new Date());
    }
    @Test
    public void deleteByAddId(){
        addressMapper.deleteByAddId(6);
    }
    @Test
    public void updateByAddId(){
        addressMapper.updateByAddId(4,9,"amy","1324322334","Beijing",
                "beijing","dongcehng","adasda","029888",1,"back",new Date());
    }

}
