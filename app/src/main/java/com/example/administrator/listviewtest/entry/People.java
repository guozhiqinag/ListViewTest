package com.example.administrator.listviewtest.entry;

/**
 * Created by Administrator on 2016/8/23.
 */
public class People {
    int id;
    String name ;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
