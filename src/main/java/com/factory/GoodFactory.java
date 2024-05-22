package com.factory;

import com.factory.good.Good;
import com.factory.phone.Phone;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/22 16:42
 * @Description:
 */
public abstract class GoodFactory {

    abstract Good createGood();

    abstract Phone createPhone();
}
