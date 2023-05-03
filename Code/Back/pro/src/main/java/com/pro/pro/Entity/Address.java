package com.pro.pro.Entity;


import java.io.Serializable;

/** the entity of delivery address*/
public class Address extends BaseEntity implements Serializable {
        private Integer add_id;
        private Integer userId;
        private String receiverName;
        private String receiverPhone;
        private String province;
        private String city;
        private String area;
        private String address;
        private String postCode;
        private Integer isDefault;

    public Integer getAdd_id() {
        return add_id;
    }

    public void setAdd_id(Integer add_id) {
        this.add_id = add_id;
    }

    public Integer getuserId() {
        return userId;
    }

    public void setuserId(Integer user_id) {
        this.userId = user_id;
    }

    public String getreceiverName() {
        return receiverName;
    }

    public void setreceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getreceiverPhone() {
        return receiverPhone;
    }

    public void setreceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getpostCode() {
        return postCode;
    }

    public void setpostCode(String postCode) {
        this.postCode = postCode;
    }


    public Integer getisDefault() {
        return isDefault;
    }

    public void setisDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address1 = (Address) o;

        if (getAdd_id() != null ? !getAdd_id().equals(address1.getAdd_id()) : address1.getAdd_id() != null)
            return false;
        if (getuserId() != null ? !getuserId().equals(address1.getuserId()) : address1.getuserId() != null)
            return false;
        if (getreceiverName() != null ? !getreceiverName().equals(address1.getreceiverName()) : address1.getreceiverName() != null)
            return false;
        if (getreceiverPhone() != null ? !getreceiverPhone().equals(address1.getreceiverPhone()) : address1.getreceiverPhone() != null)
            return false;
        if (getProvince() != null ? !getProvince().equals(address1.getProvince()) : address1.getProvince() != null)
            return false;
        if (getCity() != null ? !getCity().equals(address1.getCity()) : address1.getCity() != null) return false;
        if (getArea() != null ? !getArea().equals(address1.getArea()) : address1.getArea() != null) return false;
        if (getAddress() != null ? !getAddress().equals(address1.getAddress()) : address1.getAddress() != null)
            return false;
        if (getpostCode() != null ? !getpostCode().equals(address1.getpostCode()) : address1.getpostCode() != null)
            return false;
        return getisDefault() != null ? getisDefault().equals(address1.getisDefault()) : address1.getisDefault() == null;
    }

    @Override
    public int hashCode() {
        int result = getAdd_id() != null ? getAdd_id().hashCode() : 0;
        result = 31 * result + (getuserId() != null ? getuserId().hashCode() : 0);
        result = 31 * result + (getreceiverName() != null ? getreceiverName().hashCode() : 0);
        result = 31 * result + (getreceiverPhone() != null ? getreceiverPhone().hashCode() : 0);
        result = 31 * result + (getProvince() != null ? getProvince().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getArea() != null ? getArea().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getpostCode() != null ? getpostCode().hashCode() : 0);
        result = 31 * result + (getisDefault() != null ? getisDefault().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "add_id=" + add_id +
                ", userId=" + userId +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", postCode='" + postCode + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }
}
