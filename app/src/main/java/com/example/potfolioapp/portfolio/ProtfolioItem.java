package com.example.potfolioapp.portfolio;

public class ProtfolioItem {

    private int images;
    private String title, description;

    public ProtfolioItem() {
    }

    public ProtfolioItem(int images, String title) {
        this.images = images;
        this.title = title;
    }

    public ProtfolioItem(int images, String title, String description) {
        this.images = images;
        this.title = title;
        this.description = description;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
