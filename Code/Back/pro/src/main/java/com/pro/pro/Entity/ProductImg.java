package com.pro.pro.Entity;

public class ProductImg {
    private Integer id;
    private String path;
    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductImg)) return false;

        ProductImg that = (ProductImg) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getPath() != null ? !getPath().equals(that.getPath()) : that.getPath() != null) return false;
        return getProductId() != null ? getProductId().equals(that.getProductId()) : that.getProductId() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getPath() != null ? getPath().hashCode() : 0);
        result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
        return result;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "ProductImg{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", productId=" + productId +
                '}';
    }
}
