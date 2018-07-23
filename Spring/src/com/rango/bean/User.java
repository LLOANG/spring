package com.rango.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author:龙浪(lang.long@ucarinc.com)
 * @date:2018/7/23 20:53$
 * @description:
 * @params:
 * @return:
 */
@Component("user")
public class User {
    @Value("longlang")
    private String name;
    private Integer age;
 /*   @Autowired
    @Qualifier("car")*/
    @Resource(name="car2")
    private  Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
