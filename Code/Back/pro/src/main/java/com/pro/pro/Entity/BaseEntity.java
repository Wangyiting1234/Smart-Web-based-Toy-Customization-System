package com.pro.pro.Entity;

import java.io.Serializable;
import java.util.Date;

//@Date
public class BaseEntity implements Serializable {
    private Date createTime;
    private String createUser;
    private Date updateTime;
    private String updateUser;

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;

        BaseEntity that = (BaseEntity) o;

        if (getcreateTime() != null ? !getcreateTime().equals(that.getcreateTime()) : that.getcreateTime() != null)
            return false;
        if (getcreateUser() != null ? !getcreateUser().equals(that.getcreateUser()) : that.getcreateUser() != null)
            return false;
        if (getupdateTime() != null ? !getupdateTime().equals(that.getupdateTime()) : that.getupdateTime() != null)
            return false;
        return getupdateUser() != null ? getupdateUser().equals(that.getupdateUser()) : that.getupdateUser() == null;
    }

    @Override
    public int hashCode() {
        int result = getcreateTime() != null ? getcreateTime().hashCode() : 0;
        result = 31 * result + (getcreateUser() != null ? getcreateUser().hashCode() : 0);
        result = 31 * result + (getupdateTime() != null ? getupdateTime().hashCode() : 0);
        result = 31 * result + (getupdateUser() != null ? getupdateUser().hashCode() : 0);
        return result;
    }

    public Date getcreateTime() {
        return createTime;
    }

    public void setcreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getcreateUser() {
        return createUser;
    }

    public void setcreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getupdateTime() {
        return updateTime;
    }

    public void setupdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getupdateUser() {
        return updateUser;
    }

    public void setupdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
