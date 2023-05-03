package com.pro.pro.Entity;


import java.util.List;

/** the entity of customized product*/
public class CustomizeProduct {
    private Integer customize_id;
    private String customizeName;
    private Integer parentId;
    private Long price;
    private Integer num;
    private Integer status;

    public Integer getCustomize_id() {
        return customize_id;
    }

    public void setCustomize_id(Integer customize_id) {
        this.customize_id = customize_id;
    }

    public String getCustomizeName() {
        return customizeName;
    }

    public void setCustomizeName(String customizeName) {
        this.customizeName = customizeName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomizeProduct)) return false;

        CustomizeProduct that = (CustomizeProduct) o;

        if (getCustomize_id() != null ? !getCustomize_id().equals(that.getCustomize_id()) : that.getCustomize_id() != null)
            return false;
        if (getCustomizeName() != null ? !getCustomizeName().equals(that.getCustomizeName()) : that.getCustomizeName() != null)
            return false;
        if (getParentId() != null ? !getParentId().equals(that.getParentId()) : that.getParentId() != null)
            return false;
        if (getPrice() != null ? !getPrice().equals(that.getPrice()) : that.getPrice() != null) return false;
        if (getNum() != null ? !getNum().equals(that.getNum()) : that.getNum() != null) return false;
        return getStatus() != null ? getStatus().equals(that.getStatus()) : that.getStatus() == null;
    }

    @Override
    public int hashCode() {
        int result = getCustomize_id() != null ? getCustomize_id().hashCode() : 0;
        result = 31 * result + (getCustomizeName() != null ? getCustomizeName().hashCode() : 0);
        result = 31 * result + (getParentId() != null ? getParentId().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getNum() != null ? getNum().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomizeProduct{" +
                "customize_id=" + customize_id +
                ", customizeName='" + customizeName + '\'' +
                ", parentId=" + parentId +
                ", price=" + price +
                ", num=" + num +
                ", status=" + status +
                '}';
    }
}
