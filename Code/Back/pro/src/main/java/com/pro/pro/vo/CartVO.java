package com.pro.pro.vo;

import java.io.Serializable;

public class CartVO implements Serializable {
    private Integer cartId;
    private Integer userId;
    private Integer productId;
    private Long price;
    private Integer num;
    private String name;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartVO)) return false;

        CartVO cartVO = (CartVO) o;

        if (cartId != null ? !cartId.equals(cartVO.cartId) : cartVO.cartId != null) return false;
        if (userId != null ? !userId.equals(cartVO.userId) : cartVO.userId != null) return false;
        if (productId != null ? !productId.equals(cartVO.productId) : cartVO.productId != null) return false;
        if (price != null ? !price.equals(cartVO.price) : cartVO.price != null) return false;
        if (num != null ? !num.equals(cartVO.num) : cartVO.num != null) return false;
        return name != null ? name.equals(cartVO.name) : cartVO.name == null;
    }

    @Override
    public int hashCode() {
        int result = cartId != null ? cartId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CartVO{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", price=" + price +
                ", num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
