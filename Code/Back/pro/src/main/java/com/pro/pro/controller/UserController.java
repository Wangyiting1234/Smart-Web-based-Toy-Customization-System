package com.pro.pro.controller;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.pro.pro.Entity.User;
import com.pro.pro.service.IUserService;
import com.pro.pro.service.ex.InsertException;
import com.pro.pro.service.ex.UserTelDuplicateException;
import com.pro.pro.until.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class UserController extends BaseController{
    @Autowired
    private IUserService userService;

    @RequestMapping("signin")
    public JsonResult<Void> signin(User user){
        userService.signin(user);
        return new JsonResult<>(success);
    }
    @RequestMapping("log")
    public  JsonResult<User> login(String userTel, String userPwd, HttpSession session){
        User userData = userService.login(userTel, userPwd);
        session.setAttribute("user_id",userData.getUser_id());
        session.setAttribute("userTel",userData.getuserTel());
        System.out.println(getuidFromSession(session));
        System.out.println(getUsertelFromSession(session));
        System.out.println("session id:"+session.getId());
        return new JsonResult<>(success,userData);
    }
    @RequestMapping("modifypwd")
    public JsonResult<Void> ChangePassword(String userCurPwd, String userNewPwd, HttpSession session){
        Integer user_id = getuidFromSession(session);
        String userTel = getUsertelFromSession(session);
        System.out.println(user_id);
        System.out.println(userTel);
        System.out.println(userCurPwd);
        System.out.println(userNewPwd);
        userService.ChangePassword(user_id,userTel,userCurPwd,userNewPwd);
        return new JsonResult<>(success);
    }
    @RequestMapping("getbyuserid")
    public JsonResult<User> getByUserId(HttpSession session){
        User userData = userService.getByUserId(getuidFromSession(session));
        return new JsonResult<>(success,userData);
    }
    @RequestMapping("modifyuserinfo")
    public JsonResult<Void> changeInfo(User user, HttpSession session){
        userService.changeInfo(getuidFromSession(session),user.getuserName(),user);
        return new JsonResult<>(success);
    }

}
