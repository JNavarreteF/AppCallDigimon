package com.example.digimon;

import com.google.gson.annotations.SerializedName;

public class DigimonModel {

    private String name;
    @SerializedName("img")
    private String imageUrl;
    private String level;

    public DigimonModel(String name, String imageUrl, String level) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.level = level;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
