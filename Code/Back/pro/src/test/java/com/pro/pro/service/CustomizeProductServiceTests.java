package com.pro.pro.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
//@RunWith:run this unit test
@RunWith(SpringRunner.class)
public class CustomizeProductServiceTests {
    @Autowired
    private ICustomizeProductService customizeProductService;
    @Test
    public void findParentId(){
        System.out.println(customizeProductService.findParentId());
    }
    @Test
    public void findProduct(){
        System.out.println(customizeProductService.findProduct());
    }
}
