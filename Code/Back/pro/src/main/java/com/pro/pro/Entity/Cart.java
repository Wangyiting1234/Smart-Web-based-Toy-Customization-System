package com.pro.pro.Entity;

import java.io.Serializable;

public class Cart extends BaseEntity implements Serializable {
    private Integer cart_id;
    private  Integer productId;
    private Integer userId;
    private Integer productNum;
    private Long productPrice;
    private String productName;
    private String productSize;
    private String productColor;

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

    public Integer getCart_id() {
        return cart_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;
        if (!super.equals(o)) return false;

        Cart cart = (Cart) o;

        if (getCart_id() != null ? !getCart_id().equals(cart.getCart_id()) : cart.getCart_id() != null) return false;
        if (getProductId() != null ? !getProductId().equals(cart.getProductId()) : cart.getProductId() != null)
            return false;
        if (getUserId() != null ? !getUserId().equals(cart.getUserId()) : cart.getUserId() != null) return false;
        if (getProductNum() != null ? !getProductNum().equals(cart.getProductNum()) : cart.getProductNum() != null)
            return false;
        if (getProductPrice() != null ? !getProductPrice().equals(cart.getProductPrice()) : cart.getProductPrice() != null)
            return false;
        if (getProductName() != null ? !getProductName().equals(cart.getProductName()) : cart.getProductName() != null)
            return false;
        if (getProductSize() != null ? !getProductSize().equals(cart.getProductSize()) : cart.getProductSize() != null)
            return false;
        return getProductColor() != null ? getProductColor().equals(cart.getProductColor()) : cart.getProductColor() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getCart_id() != null ? getCart_id().hashCode() : 0);
        result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getProductNum() != null ? getProductNum().hashCode() : 0);
        result = 31 * result + (getProductPrice() != null ? getProductPrice().hashCode() : 0);
        result = 31 * result + (getProductName() != null ? getProductName().hashCode() : 0);
        result = 31 * result + (getProductSize() != null ? getProductSize().hashCode() : 0);
        result = 31 * result + (getProductColor() != null ? getProductColor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart_id=" + cart_id +
                ", productId=" + productId +
                ", userId=" + userId +
                ", productNum=" + productNum +
                ", productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productColor='" + productColor + '\'' +
                '}';
    }
}
