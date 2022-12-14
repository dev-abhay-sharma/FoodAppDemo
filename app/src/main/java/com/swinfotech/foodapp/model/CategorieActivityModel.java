package com.swinfotech.foodapp.model;

import java.io.Serializable;

public class CategorieActivityModel implements Serializable {
    private String imageUrl;
    private String name;

    public CategorieActivityModel() {
    }

    public CategorieActivityModel(String imageUrl, String name) {
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
