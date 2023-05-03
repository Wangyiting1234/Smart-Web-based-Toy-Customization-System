package com.pro.pro.mapper;

import com.pro.pro.Entity.User;

import java.util.Date;

/**用户持久层 user Persistence Layer*/
public interface UserMapper {
    /*
    insert the data of user
     */
    Integer insert(User user);

    /**
     *
     * @param usertel user telephone number
     * @return find:return user data, not find:return null
     */
    User findByUserTel(String usertel);

    /**
     *
     * @param user_id
     * @param userPwd new password
     * @param UpdateUser person who modify password
     * @param UpdateTime update time
     * @return
     */
    Integer updatePasswordByUid(Integer user_id, String userPwd, String UpdateUser, Date UpdateTime);

    /**
     *
     * @param user_id
     * @return find:return user data, not find: return null
     */
    User findByUserId(Integer user_id);
    Integer updateUserInfo(User user);
}
