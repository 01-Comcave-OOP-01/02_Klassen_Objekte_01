package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    // Getter
    public String getName() {
        if (this.checkPermission()) {
            return name;
        } else {
            return "Sorry, no permission!";
        }
    }

    public String getFurColor() {
        return furColor;
    }

    // Setter
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    private boolean checkPermission() {
        return false;
    }



}
