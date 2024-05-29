package com.builder;

/**
 * 构造者模式，一般就是基本信息是固定的，但组合的方式是很多类。我们一般可以讲基本信息放入数据库中，按照配置的需求，进行组合装配
 *
 *
 * @Auther: wangyimin 688153
 * @Date: 2024/5/29 10:36
 * @Description:
 */
public class OrderBuilder {

    public Director get1(String order, String good){
        return new UserDirector().good(good).order(order);
    }

    public Director get2(String order, String good){
        return new UserDirector().good(good).order(order);
    }
}
