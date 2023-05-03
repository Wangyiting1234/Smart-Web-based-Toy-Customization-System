package com.pro.pro.Entity;



/** the entity of product param*/
public class ProductParam {
        private Integer param_id;
    private Integer productId;
    private String  size;
    private String material;
    private Long weight;
    private Long height;
    private String color;
    private Long price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getParam_id() {
        return param_id;
    }

    public void setParam_id(Integer param_id) {
        this.param_id = param_id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductParam)) return false;

        ProductParam that = (ProductParam) o;

        if (getParam_id() != null ? !getParam_id().equals(that.getParam_id()) : that.getParam_id() != null)
            return false;
        if (getProductId() != null ? !getProductId().equals(that.getProductId()) : that.getProductId() != null)
            return false;
        if (getSize() != null ? !getSize().equals(that.getSize()) : that.getSize() != null) return false;
        if (getMaterial() != null ? !getMaterial().equals(that.getMaterial()) : that.getMaterial() != null)
            return false;
        if (getWeight() != null ? !getWeight().equals(that.getWeight()) : that.getWeight() != null) return false;
        if (getHeight() != null ? !getHeight().equals(that.getHeight()) : that.getHeight() != null) return false;
        if (getColor() != null ? !getColor().equals(that.getColor()) : that.getColor() != null) return false;
        return getPrice() != null ? getPrice().equals(that.getPrice()) : that.getPrice() == null;
    }

    @Override
    public int hashCode() {
        int result = getParam_id() != null ? getParam_id().hashCode() : 0;
        result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
        result = 31 * result + (getSize() != null ? getSize().hashCode() : 0);
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        result = 31 * result + (getWeight() != null ? getWeight().hashCode() : 0);
        result = 31 * result + (getHeight() != null ? getHeight().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductParam{" +
                "param_id=" + param_id +
                ", productId=" + productId +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
