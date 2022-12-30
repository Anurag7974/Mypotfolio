package com.example.potfolioapp.team;

public class TeamItem {

    private String name,desc;
    private int img;

    public TeamItem(String name, String desc, int img) {
        this.name = name;
        this.desc = desc;
        this.img = img;
    }

    public TeamItem() {

    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }
}
