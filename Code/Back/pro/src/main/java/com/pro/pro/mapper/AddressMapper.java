package com.pro.pro.mapper;

import com.pro.pro.Entity.Address;
import com.sun.javafx.event.EventDispatchTreeImpl;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/** delivery address Persistence Layer* */
public interface AddressMapper {
    /**
     * insert new address for users
     * @param address data of address
     * @return the effected row
     */
    Integer insert(Address address);

    /**
     * count the number of address of users
     * @param userId
     * @return current number of address
     */
    Integer countByUserId(Integer userId);

    /**
     *find address list by user id
     * @param userId
     * @return the list of address data
     */
    List<Address> findByUserId(Integer userId);
    Address findByAddressId(Integer addId);
    Integer updateNoneDefault(Integer userId);
    Integer updateDefaultByUserId(@Param("addId") Integer addId,
                                  @Param("updateUser") String updateUser,
                                  @Param("updateTime") Date updateTime);
    Integer deleteByAddId(Integer addId);
    Integer updateByAddId(@Param("addId") Integer addId,
                          @Param("userId") Integer userId,
                          @Param("receiverName") String receiverName,
                          @Param("receiverPhone") String receiverPhone,
                          @Param("province") String province,
                          @Param("city") String city,
                          @Param("area") String area,
                          @Param("address") String address,
                          @Param("postCode") String postCode,
                          @Param("isDefault") Integer isDefault,
                          @Param("updateUser") String updateUser,
                          @Param("updateTime") Date updateTime);
}
