package com.pro.pro.mapper;

import com.pro.pro.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
//@RunWith:run this unit test
@RunWith(SpringRunner.class)
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void insert(){
        User user = new User();
        user.setuserTel("15604781879");
        user.setuserPwd("123123");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }
    @Test
    public void findByUserTel(){
        User user = userMapper.findByUserTel("15604781387");
        System.out.println(user);
    }
    @Test
    public void updatePasswordByUid(){
        userMapper.updatePasswordByUid(8,"123123","user",new Date());
    }
    @Test
    public void getByUserId(){
        User user = userMapper.findByUserId(10);
        System.out.println(user);
    }
    @Test
    public void updateUserInfo(){
        User user  = new User();
        user.setUser_id(14);
        user.setuserName("haha");
        user.setuserGender(0);
        user.setupdateUser("end");
        user.setupdateTime(new Date());
        userMapper.updateUserInfo(user);
    }
}
