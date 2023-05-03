package com.pro.pro.controller;


import com.pro.pro.Entity.Product;

import com.pro.pro.Entity.ProductImg;
import com.pro.pro.service.IProductService;
import com.pro.pro.until.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("toy")
@RestController
public class ProductController extends BaseController{
    @Autowired
    private IProductService productService;
    @RequestMapping("hottoy")
    public JsonResult<List<Product>> findHotBySales(){
        List<Product> list= productService.findHotBySales();
        return new JsonResult<List<Product>>(success,list);
    }
    @RequestMapping("newtoy")
    public JsonResult<List<Product>> findNewToy(){
        List<Product> list= productService.findByTime();
        return new JsonResult<List<Product>>(success,list);
    }
    @RequestMapping("{productId}")
    public JsonResult<Product> findById(@PathVariable("productId")Integer productId){
        Product product= productService.findById(productId);
        return new JsonResult<Product>(success,product);
    }

    @RequestMapping("{productId}/img")
    public JsonResult<List<ProductImg>> findByProductId(@PathVariable("productId")Integer productId){
        List<ProductImg> list = productService.findByProductId(productId);
        return new JsonResult<List<ProductImg>>(success,list);

    }
//    @PostMapping("addaddress")
//    public JsonResult<Void> addNewAddress(Address address,HttpSession session){
//            Integer userId = getuidFromSession(session);
//            String userTel = getUsertelFromSession(session);
//            addressService.addNewAddress(userId,userTel,address);
//            return new JsonResult<>(success);
//    }
//    @RequestMapping("deliveryaddress")
//    public JsonResult<List<Address>> getByUserId(HttpSession session){
//        Integer userId= getuidFromSession(session);
//        List<Address> data = addressService.getByUserId(userId);
//        return new JsonResult<>(success,data);
//    }
//    @RequestMapping("{addId}/setdefault")
//    public JsonResult<Void> setDefault(@PathVariable("addId") Integer addId,
//                                       HttpSession session){
//        Integer userId= getuidFromSession(session);
//        String userTel = getUsertelFromSession(session);
//        addressService.setDefault(addId,userId,userTel);
//        return new JsonResult<>(success);
//
//    }
//    @RequestMapping("{addId}/deleteaddress")
//    public JsonResult<Void>  deleteAddress(@PathVariable("addId") Integer addId,
//                                           HttpSession session){
//        Integer userId= getuidFromSession(session);
//        addressService.deleteAddress(addId,userId);
//        return new JsonResult<>(success);
//    }
//    @RequestMapping("{addId}/updateaddress")
//    public JsonResult<Void> updateAddress(@PathVariable("addId") Integer addId,
//                                          Address address, HttpSession session){
//        Integer userId= getuidFromSession(session);
//        String userTel  =  getUsertelFromSession(session);
//        addressService.updateAddress(addId,userTel,userId,address);
//        return new JsonResult<>(success);
//    }

}
