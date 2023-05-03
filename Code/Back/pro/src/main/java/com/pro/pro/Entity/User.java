package com.pro.pro.Entity;

import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.Serializable;

//@Component
public class User extends BaseEntity implements Serializable {
    private Integer user_id;
    private String userName;
    private String userPwd;
    private Integer userGender;
    private String userTel;
    private String userSalt;
    private Integer isDelete;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserPwd() {
        return userPwd;
    }

    public void setuserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getuserGender() {
        return userGender;
    }

    public void setuserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getuserTel() {
        return userTel;
    }

    public void setuserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getuserSalt() {
        return userSalt;
    }

    public void setuserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public Integer getisDelete() {
        return isDelete;
    }

    public void setisDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (getUser_id() != null ? !getUser_id().equals(user.getUser_id()) : user.getUser_id() != null) return false;
        if (getuserName() != null ? !getuserName().equals(user.getuserName()) : user.getuserName() != null)
            return false;
        if (getuserPwd() != null ? !getuserPwd().equals(user.getuserPwd()) : user.getuserPwd() != null)
            return false;
        if (getuserGender() != null ? !getuserGender().equals(user.getuserGender()) : user.getuserGender() != null)
            return false;
        if (getuserTel() != null ? !getuserTel().equals(user.getuserTel()) : user.getuserTel() != null)
            return false;
        if (getuserSalt() != null ? !getuserSalt().equals(user.getuserSalt()) : user.getuserSalt() != null)
            return false;
        return getisDelete() != null ? getisDelete().equals(user.getisDelete()) : user.getisDelete() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getUser_id() != null ? getUser_id().hashCode() : 0);
        result = 31 * result + (getuserName() != null ? getuserName().hashCode() : 0);
        result = 31 * result + (getuserPwd() != null ? getuserPwd().hashCode() : 0);
        result = 31 * result + (getuserGender() != null ? getuserGender().hashCode() : 0);
        result = 31 * result + (getuserTel() != null ? getuserTel().hashCode() : 0);
        result = 31 * result + (getuserSalt() != null ? getuserSalt().hashCode() : 0);
        result = 31 * result + (getisDelete() != null ? getisDelete().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userGender=" + userGender +
                ", userTel=" + userTel +
                ", userSalt='" + userSalt + '\'' +
                ", isDelete=" + isDelete +
                '}'+super.toString();
    }
}
