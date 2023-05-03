package com.pro.pro.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.pro.pro.service.ex.NotLoginException;
import com.pro.pro.service.ex.UserTelNotFindException;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public class LoginInterceptor implements HandlerInterceptor {
    /**
     * check data of user whether is inlcuded in session has->allow visit;not:router to login
     * @param request current HTTP request
     * @param response current HTTP response
     * @param handler chosen handler to execute, for type and/or instance evaluation
     * @return true:allow false:stop
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object obj = request.getSession().getAttribute("user_id");
        if(obj==null){

//            JSONObject res = new JSONObject();
//            res.put("status","-1");
//            res.put("msg","need login");
//            PrintWriter out = null ;
//
//            out.write(res.toString());
//            out.flush();
//            out.close();
            throw new NotLoginException("user has not logged in");
        }
        return true;
    }
}
