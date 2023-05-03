package com.pro.pro.service;


import com.pro.pro.Entity.User;
import com.pro.pro.service.ex.ServiceException;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
//@RunWith:run this unit test
@RunWith(SpringRunner.class)
public class UserServiceTests {
    @Autowired
    private IUserService userService;
    @Test
    public void reg(){
        try {
            User user = new User();
            user.setuserTel("15604781212");
            user.setuserPwd("121212");
            userService.signin(user);
            System.out.println("register successfully");
        } catch (ServiceException e) {
            //get the class name
            System.out.println(e.getClass().getSimpleName());
            //get the description of exception
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void login(){
            User user= userService.login("15604789807","121212");
            System.out.println(user);
    }
    @Test
    public void ChangePassword(){
        userService.ChangePassword(19,"15604781345","122123","121212");

    }
    @Test
    public void getByUserId(){
        User user = userService.getByUserId(200);
        System.out.println(user);
    }
    @Test
    public void changeInfo(){
        User user =new User();
        user.setuserGender(0);

        userService.changeInfo(130,"Alice",user);
    }


}
