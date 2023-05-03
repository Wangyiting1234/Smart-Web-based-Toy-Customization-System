package com.pro.pro.mapper;

import com.pro.pro.Entity.Address;
import com.pro.pro.Entity.Cart;
import com.pro.pro.vo.CartVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/** delivery address Persistence Layer* */
public interface CartMapper {
    /**
     * insert new product for users
     *
     * @param cart data of address
     * @return the effected row
     */
    Integer insert(Cart cart);
    Integer updateNumById(Integer cart_id, Integer productNum,String updateUser,Date updateTime);

    /**
     * search data of cart according to product id and user id
     * @param productId
     * @param userId
     * @return
     */
    Cart findByUIdAndPid(Integer productId,Integer userId);
    List<Cart> findByUid(Integer userId);
    List<Cart> findByCids(Integer[] cids);
    List<CartVO> findUid(Integer userId);
}

