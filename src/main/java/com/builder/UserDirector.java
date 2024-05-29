package com.builder;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/29 11:26
 * @Description:
 */
public class UserDirector implements Director{
    private String order;
    private String good;

    @Override
    public Director order(String order) {
        this.order = order;
        return this;
    }

    @Override
    public Director good(String good) {
        this.good = good;
        return this;
    }
}
