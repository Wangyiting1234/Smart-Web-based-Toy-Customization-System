package com.pro.pro.Config;

import com.pro.pro.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LoginInterceptorConfigurer implements WebMvcConfigurer {
    /**Config interceptor*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor interceptor  = new LoginInterceptor();
        List<String> patterns = new ArrayList<>();
        //需要拦截的页面
        patterns.add("/user/account");
        patterns.add("/user/mycart");
        patterns.add("/user/modifypwd");
        patterns.add("/user/modifyuserinfo");
        patterns.add("/cart/addcart");
        registry.addInterceptor(interceptor).addPathPatterns(patterns);
    }
}
