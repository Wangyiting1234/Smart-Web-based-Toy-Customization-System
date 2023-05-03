package com.pro.pro.Entity;


import java.io.Serializable;

public class Product extends BaseEntity implements Serializable {
    private Integer product_id;
    private String productName;
    private Integer stockNum;
    private Integer status;
    private String dis;
    private Integer RootCateId;
    private Integer cateId;
    private String img;

    private Integer sales;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public Integer getstockNum() {
        return stockNum;
    }

    public void setstockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getdis() {
        return dis;
    }

    public void setdis(String dis) {
        this.dis = dis;
    }

    public Integer getRootCateId() {
        return RootCateId;
    }

    public void setRootCateId(Integer RootCateId) {
        this.RootCateId = RootCateId;
    }

    public Integer getcateId() {
        return cateId;
    }

    public void setcateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        if (!super.equals(o)) return false;

        Product product = (Product) o;

        if (getProduct_id() != null ? !getProduct_id().equals(product.getProduct_id()) : product.getProduct_id() != null)
            return false;
        if (getproductName() != null ? !getproductName().equals(product.getproductName()) : product.getproductName() != null)
            return false;
        if (getstockNum() != null ? !getstockNum().equals(product.getstockNum()) : product.getstockNum() != null)
            return false;
        if (getStatus() != null ? !getStatus().equals(product.getStatus()) : product.getStatus() != null) return false;
        if (getdis() != null ? !getdis().equals(product.getdis()) : product.getdis() != null)
            return false;
        if (getRootCateId() != null ? !getRootCateId().equals(product.getRootCateId()) : product.getRootCateId() != null)
            return false;
        if (getcateId() != null ? !getcateId().equals(product.getcateId()) : product.getcateId() != null)
            return false;
        if (getImg() != null ? !getImg().equals(product.getImg()) : product.getImg() != null) return false;

        return getSales() != null ? getSales().equals(product.getSales()) : product.getSales() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getProduct_id() != null ? getProduct_id().hashCode() : 0);
        result = 31 * result + (getproductName() != null ? getproductName().hashCode() : 0);
        result = 31 * result + (getstockNum() != null ? getstockNum().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getdis() != null ? getdis().hashCode() : 0);
        result = 31 * result + (getRootCateId() != null ? getRootCateId().hashCode() : 0);
        result = 31 * result + (getcateId() != null ? getcateId().hashCode() : 0);
        result = 31 * result + (getImg() != null ? getImg().hashCode() : 0);

        result = 31 * result + (getSales() != null ? getSales().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", productName='" + productName + '\'' +
                ", stockNum=" + stockNum +
                ", status=" + status +
                ", dis='" + dis + '\'' +
                ", RootCateId=" + RootCateId +
                ", cateId=" + cateId +
                ", img='" + img + '\'' +
                ", sales=" + sales +
                '}';
    }
}

