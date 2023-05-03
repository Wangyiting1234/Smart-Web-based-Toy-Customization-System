package com.pro.pro.Entity;

public class Cate {
    private Integer cate_id;
    private String cateName;
    private Integer cateLevel;
    private Integer parentId;
    private String cateDes;

    public Integer getCate_id() {
        return cate_id;
    }

    public void setCate_id(Integer cate_id) {
        this.cate_id = cate_id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Integer getCateLevel() {
        return cateLevel;
    }

    public void setCateLevel(Integer cateLevel) {
        this.cateLevel = cateLevel;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCateDes() {
        return cateDes;
    }

    public void setCateDes(String cateDes) {
        this.cateDes = cateDes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cate)) return false;

        Cate cate = (Cate) o;

        if (getCate_id() != null ? !getCate_id().equals(cate.getCate_id()) : cate.getCate_id() != null) return false;
        if (getCateName() != null ? !getCateName().equals(cate.getCateName()) : cate.getCateName() != null)
            return false;
        if (getCateLevel() != null ? !getCateLevel().equals(cate.getCateLevel()) : cate.getCateLevel() != null)
            return false;
        if (getParentId() != null ? !getParentId().equals(cate.getParentId()) : cate.getParentId() != null)
            return false;
        return getCateDes() != null ? getCateDes().equals(cate.getCateDes()) : cate.getCateDes() == null;
    }

    @Override
    public int hashCode() {
        int result = getCate_id() != null ? getCate_id().hashCode() : 0;
        result = 31 * result + (getCateName() != null ? getCateName().hashCode() : 0);
        result = 31 * result + (getCateLevel() != null ? getCateLevel().hashCode() : 0);
        result = 31 * result + (getParentId() != null ? getParentId().hashCode() : 0);
        result = 31 * result + (getCateDes() != null ? getCateDes().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cate{" +
                "cate_id=" + cate_id +
                ", cateName='" + cateName + '\'' +
                ", cateLevel='" + cateLevel + '\'' +
                ", parentId=" + parentId +
                ", cateDes='" + cateDes + '\'' +
                '}';
    }
}
