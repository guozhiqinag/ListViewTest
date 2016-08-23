package com.example.administrator.listviewtest.entry;

/**
 * Created by Administrator on 2016/8/18.
 */
public class Fruit {
    private String name ;
    private  int img;

    public Fruit(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
