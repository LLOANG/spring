package com.rano.test;

import com.rango.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:龙浪(lang.long@ucarinc.com)
 * @date:2018/7/23 21:11$
 * @description:
 * @params:
 * @return:
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
        User user=(User)ac.getBean("user");
        System.out.println(user);
    }
}
