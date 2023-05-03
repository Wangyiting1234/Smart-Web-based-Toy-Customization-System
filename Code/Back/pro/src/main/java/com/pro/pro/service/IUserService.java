package com.pro.pro.service;

import com.pro.pro.Entity.User;

import javax.servlet.http.HttpSession;

/**service layer of user block */
public interface IUserService {
    void signin(User user);
    User login(String userTel,String userPwd);
    void ChangePassword(Integer user_id,String userTel,String curPwd,String newPwd);
    User getByUserId(Integer user_id);
    void changeInfo(Integer user_id, String userName,User user);

}
