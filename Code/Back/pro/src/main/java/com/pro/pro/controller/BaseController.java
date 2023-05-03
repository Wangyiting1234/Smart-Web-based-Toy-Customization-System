package com.pro.pro.controller;

import com.pro.pro.Entity.Address;
import com.pro.pro.service.ex.*;
import com.pro.pro.until.JsonResult;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

//当前项目产生异常，被统一拦截到此方法中，这个方法充当请求处理的方法，方法的返回值直接给前端
/** base class of controller class*/
public class BaseController {
    public static final int success = 200;

    @ExceptionHandler(ServiceException.class)
    public JsonResult<Void> handleException(Throwable e){
        JsonResult<Void> result= new JsonResult<>(e);
        if(e instanceof UserTelDuplicateException){
            result.setState(4000);
            result.setMessage("telephone number has already been registered");
        } else if(e instanceof  AddressCountLimitException){
            result.setState(4001);
            result.setMessage("your total number of delivery addresses exceeds 20");
        } else if(e instanceof AddressNotFound) {
            result.setState(4002);
            result.setMessage("your address is not found");
        }else if (e instanceof AccessDeniedException){
            result.setState(4003);
            result.setMessage("your address data is illegal");
        }
        else if(e instanceof InsertException){
            result.setState(5000);
            result.setMessage("an unknown exception was generated during registration,please register again");
        }
        else if(e instanceof UserTelNotFindException){
            result.setState(5001);
            result.setMessage("telephone number has not been register");
        }
        else if(e instanceof PwdNotMatchException){
            result.setState(5002);
            result.setMessage("password is wrong");
        }
        else if(e instanceof NotLoginException){
            result.setState(5003);
            result.setMessage("user has not logged in");
        }
        else if(e instanceof UpdateException){
            result.setState(5004);
            result.setMessage("Generate unknown exception while updating password");
        }
        else if(e instanceof UserNotFindException){
            result.setState(5005);
            result.setMessage("User has not been found");
        }
        else if(e instanceof UpdateException){
            result.setState(5006);
            result.setMessage("Generate unknown exception while updating information");
        }
        else if (e instanceof InsertException){
            result.setState(5007);
            result.setMessage("Generate exception when inserting delivery address");
        }
        else if(e instanceof UpdateException){
            result.setState(5008);
            result.setMessage("Generate exception while updating default address");
        }
        else if(e instanceof DeleteException){
            result.setState(5009);
            result.setMessage("Generate exception while deleting address");
        }
        else if(e instanceof UpdateException){
            result.setState(5010);
            result.setMessage("Generate exception while updating address information");
        }

        return result;
    }

    protected final Integer getuidFromSession(HttpSession session){
        return Integer.valueOf(session.getAttribute("user_id").toString());
    }
    protected final String getUsertelFromSession(HttpSession session){
        return session.getAttribute("userTel").toString();
    }

}
