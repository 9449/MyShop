package com.qfedu.shop.pojo;

import java.util.List;

public class Goods {
    private Integer goodId;

    private String goodname;

    private Integer price;

    private Integer sortId;

    private String description;

    private String sortname;

    private List<Goodimg> imgs;

    public String getSortname() {
        return sortname;
    }

    public void setSortname(String sortname) {
        this.sortname = sortname;
    }

    public List<Goodimg> getImgs() {
        return imgs;
    }

    public void setImgs(List<Goodimg> imgs) {
        this.imgs = imgs;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}