package com.chmielowiec.world;


public class Plant {
    private String name;
    public final static int ID = 2013;
    protected String type;
    protected int size;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Plant() {
        name = "Freddy";
        type = "plant";
        size = 14;
        age = 2;
    }
}
