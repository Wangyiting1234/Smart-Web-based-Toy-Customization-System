package com.pro.pro.Entity;

import java.io.Serializable;
import java.util.Date;

public class Order extends BaseEntity implements Serializable {
  private Integer order_id;
    private Integer userId;

    private String receiverName;
    private String receiverPhone;
    private String province;
    private String city;
    private String area;
    private String address;
    private Long totalAmount;


    private Integer status;


    private Date payTime;
    private Date OrderTime;
  public Integer getOrder_id() {
    return order_id;
  }

  public void setOrder_id(Integer order_id) {
    this.order_id = order_id;
  }

  public Integer getuserId() {
    return userId;
  }

  public void setuserId(Integer userId) {
    this.userId = userId;
  }


  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }

  public String getReceiverPhone() {
    return receiverPhone;
  }

  public void setReceiverPhone(String receiverPhone) {
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

  public Long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }



  public Date getPayTime() {
    return payTime;
  }

  public void setPayTime(Date payTime) {
    this.payTime = payTime;
  }

  public Date getOrderTime() {
    return OrderTime;
  }

  public void setOrderTime(Date orderTime) {
    OrderTime = orderTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Order)) return false;
    if (!super.equals(o)) return false;

    Order order = (Order) o;

    if (getOrder_id() != null ? !getOrder_id().equals(order.getOrder_id()) : order.getOrder_id() != null) return false;
    if (getuserId() != null ? !getuserId().equals(order.getuserId()) : order.getuserId() != null) return false;

    if (getReceiverName() != null ? !getReceiverName().equals(order.getReceiverName()) : order.getReceiverName() != null)
      return false;
    if (getReceiverPhone() != null ? !getReceiverPhone().equals(order.getReceiverPhone()) : order.getReceiverPhone() != null)
      return false;
    if (getProvince() != null ? !getProvince().equals(order.getProvince()) : order.getProvince() != null) return false;
    if (getCity() != null ? !getCity().equals(order.getCity()) : order.getCity() != null) return false;
    if (getArea() != null ? !getArea().equals(order.getArea()) : order.getArea() != null) return false;
    if (getAddress() != null ? !getAddress().equals(order.getAddress()) : order.getAddress() != null) return false;
    if (getTotalAmount() != null ? !getTotalAmount().equals(order.getTotalAmount()) : order.getTotalAmount() != null)
      return false;
    if (getPayTime() != null ? !getPayTime().equals(order.getPayTime()) : order.getPayTime() != null) return false;
    return getOrderTime() != null ? getOrderTime().equals(order.getOrderTime()) : order.getOrderTime() == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (getOrder_id() != null ? getOrder_id().hashCode() : 0);
    result = 31 * result + (getuserId() != null ? getuserId().hashCode() : 0);

    result = 31 * result + (getReceiverName() != null ? getReceiverName().hashCode() : 0);
    result = 31 * result + (getReceiverPhone() != null ? getReceiverPhone().hashCode() : 0);
    result = 31 * result + (getProvince() != null ? getProvince().hashCode() : 0);
    result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
    result = 31 * result + (getArea() != null ? getArea().hashCode() : 0);
    result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
    result = 31 * result + (getTotalAmount() != null ? getTotalAmount().hashCode() : 0);
    result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
    result = 31 * result + (getPayTime() != null ? getPayTime().hashCode() : 0);
    result = 31 * result + (getOrderTime() != null ? getOrderTime().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Order{" +
            "order_id=" + order_id +
            ", userId=" + userId +
            ", receiverName='" + receiverName + '\'' +
            ", receiverPhone='" + receiverPhone + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", area='" + area + '\'' +
            ", address='" + address + '\'' +
            ", totalAmount=" + totalAmount +
            ", status=" + status +
            ", payTime=" + payTime +
            ", OrderTime=" + OrderTime +
            '}';
  }
}
