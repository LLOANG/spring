package com.rango.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author:龙浪(lang.long@ucarinc.com)
 * @date:2018/7/23 20:53$
 * @description:
 * @params:
 * @return:
 */
@Component("car")
public class Car {
    @Value("红色")
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
