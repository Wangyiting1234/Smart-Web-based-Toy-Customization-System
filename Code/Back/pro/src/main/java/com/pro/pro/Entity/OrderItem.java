package com.pro.pro.Entity;

import java.io.Serializable;

public class OrderItem extends BaseEntity implements Serializable {
    private Integer item_id;
    private Integer orderId;
    private Integer productId;
    private String productName;

    private String productSize;
    private String productColor;
    private Integer productNum;

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }



    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem)) return false;
        if (!super.equals(o)) return false;

        OrderItem orderItem = (OrderItem) o;

        if (getItem_id() != null ? !getItem_id().equals(orderItem.getItem_id()) : orderItem.getItem_id() != null)
            return false;
        if (getOrderId() != null ? !getOrderId().equals(orderItem.getOrderId()) : orderItem.getOrderId() != null)
            return false;
        if (getProductId() != null ? !getProductId().equals(orderItem.getProductId()) : orderItem.getProductId() != null)
            return false;
        if (getProductName() != null ? !getProductName().equals(orderItem.getProductName()) : orderItem.getProductName() != null)
            return false;

        if (getProductSize() != null ? !getProductSize().equals(orderItem.getProductSize()) : orderItem.getProductSize() != null)
            return false;
        if (getProductColor() != null ? !getProductColor().equals(orderItem.getProductColor()) : orderItem.getProductColor() != null)
            return false;
        return getProductNum() != null ? getProductNum().equals(orderItem.getProductNum()) : orderItem.getProductNum() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getItem_id() != null ? getItem_id().hashCode() : 0);
        result = 31 * result + (getOrderId() != null ? getOrderId().hashCode() : 0);
        result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
        result = 31 * result + (getProductName() != null ? getProductName().hashCode() : 0);
        result = 31 * result + (getProductSize() != null ? getProductSize().hashCode() : 0);
        result = 31 * result + (getProductColor() != null ? getProductColor().hashCode() : 0);
        result = 31 * result + (getProductNum() != null ? getProductNum().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "item_id=" + item_id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productColor='" + productColor + '\'' +
                ", productNum=" + productNum +
                '}';
    }
}
