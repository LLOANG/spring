package com.rango.bean;

/**
 * @author:龙浪(lang.long@ucarinc.com)
 * @date:2018/7/23 20:53$
 * @description:
 * @params:
 * @return:
 */
public class Car {
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
