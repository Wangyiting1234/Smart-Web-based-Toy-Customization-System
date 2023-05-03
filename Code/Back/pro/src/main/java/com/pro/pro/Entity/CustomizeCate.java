package com.pro.pro.Entity;



/** the entity of customized categories*/
public class CustomizeCate{
    private Integer customizeCate_id;
    private String  customizeCateName;

    public Integer getCustomizeCate_id() {
        return customizeCate_id;
    }

    public void setCustomizeCate_id(Integer customizeCate_id) {
        this.customizeCate_id = customizeCate_id;
    }

    public String getCustomizeCateName() {
        return customizeCateName;
    }

    public void setCustomizeCateName(String customizeCateName) {
        this.customizeCateName = customizeCateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomizeCate)) return false;
        if (!super.equals(o)) return false;

        CustomizeCate that = (CustomizeCate) o;

        if (getCustomizeCate_id() != null ? !getCustomizeCate_id().equals(that.getCustomizeCate_id()) : that.getCustomizeCate_id() != null)
            return false;
        return getCustomizeCateName() != null ? getCustomizeCateName().equals(that.getCustomizeCateName()) : that.getCustomizeCateName() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getCustomizeCate_id() != null ? getCustomizeCate_id().hashCode() : 0);
        result = 31 * result + (getCustomizeCateName() != null ? getCustomizeCateName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomizeCate{" +
                "customizeCate_id=" + customizeCate_id +
                ", customizeCateName='" + customizeCateName + '\'' +
                '}';
    }
}
