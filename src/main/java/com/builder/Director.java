package com.builder;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/29 11:24
 * @Description:
 */
public interface Director {
    Director order(String order);
    Director good(String good);
}
