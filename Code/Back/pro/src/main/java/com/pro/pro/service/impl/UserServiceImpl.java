package com.pro.pro.service.impl;

import com.pro.pro.Entity.User;
import com.pro.pro.mapper.UserMapper;
import com.pro.pro.service.IUserService;
import com.pro.pro.service.ex.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;


@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void signin(User logvo) {
        User user=new User();
        BeanUtils.copyProperties(logvo,user);
        String userTel = user.getuserTel();
        User result = userMapper.findByUserTel(userTel);
        if(result!=null){
            throw new UserTelDuplicateException("telephone number already has been registered");
        }
        //encrypt pwd
        String oldPwd = user.getuserPwd();
        String salt = UUID.randomUUID().toString().toUpperCase();
        user.setuserSalt(salt);
        String md5pwd = getMD5Pwd(oldPwd,salt);
        user.setuserPwd(md5pwd);

        //set default od delete value
        user.setisDelete(0);
        user.setcreateUser(userTel);
        user.setupdateUser(userTel);
        Date date = new Date();
        user.setcreateTime(date);
        user.setupdateTime(date);
        Integer rows = userMapper.insert(user);
        if(rows!=1){
            throw new InsertException("there exits some unknown exceptions");
        }
    }

    private String getMD5Pwd(String pwd, String salt){
        //call method of md5
        for(int i =0;i<3;i++) {
            //将密码和盐值作为整体加密，忽略原有密码迁都提升数据安全性
           pwd =  DigestUtils.md5DigestAsHex((salt + pwd + salt).getBytes()).toUpperCase();
        }
        return pwd;
    }

    @Override
    public User login(String userTel,String userPwd){
        //check user telephone number whether is matching with user password
        User result = userMapper.findByUserTel(userTel);

        if(result==null){
            throw new UserTelNotFindException("telephone number has not been registered");
        }
        String salt = result.getuserSalt();
        String newPwd = getMD5Pwd(userPwd, salt);
        String oldPwd = result.getuserPwd();
        if(!oldPwd.equals(newPwd)){
            throw new PwdNotMatchException("password is wrong");
        }
        //check the user telephone number whether is deleted
        if(result.getisDelete()==1){
            throw new UserTelNotFindException("telephone number has not been registered");
        }
        User user = new User();
        user.setUser_id(result.getUser_id());
        user.setuserTel(result.getuserTel());
        user.setuserPwd(result.getuserPwd());
        return user;
    }

    @Override
    public void ChangePassword(Integer user_id, String userTel, String curPwd, String newPwd) {
        User result = userMapper.findByUserId(user_id);
        if(result==null||result.getisDelete()==1){
            throw new UserNotFindException("user has not been found");
        }
        //matching new pwd and old pwd
        String oldMD5Pwd = getMD5Pwd(curPwd,result.getuserSalt());
        if(!result.getuserPwd().equals(oldMD5Pwd)){
            throw new PwdNotMatchException("password is wrong");
        }
        String newMD5Pwd = getMD5Pwd(newPwd,result.getuserSalt());
        Integer rows = userMapper.updatePasswordByUid(user_id,newMD5Pwd, userTel,new Date());
        if(rows!=1){
            throw new UpdateException("Generate unknown exception while updating password");
        }

    }

    @Override
    public User getByUserId(Integer user_id) {
        User result =  userMapper.findByUserId(user_id);
        if(result==null||result.getisDelete()==1) {
            throw new UserNotFindException("user has not been found");
        }
        User user = new User();
        user.setuserName(result.getuserName());
        user.setuserGender(result.getuserGender());
        return user;
    }

    @Override
    public void changeInfo(Integer user_id, String userName, User user) {
        User result =  userMapper.findByUserId(user_id);
        if(result==null||result.getisDelete()==1) {
            throw new UserNotFindException("user has not been found");
        }
        user.setUser_id(user_id);
        user.setuserName(userName);
        user.setupdateUser(userName);
        user.setupdateTime(new Date());
        Integer rows = userMapper.updateUserInfo(user);
        if(rows!=1){
            throw new UpdateException("Generate unknown exception while updating your information");
        }

    }

}
