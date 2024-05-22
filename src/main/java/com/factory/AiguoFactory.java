package com.factory;

import com.factory.good.ClothGood;
import com.factory.good.Good;
import com.factory.phone.HuaweiPhone;
import com.factory.phone.Phone;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/22 17:25
 * @Description:
 */
public class AiguoFactory extends GoodFactory{
    @Override
    Good createGood() {
        return new ClothGood();
    }

    Phone createPhone(){
        return new HuaweiPhone();
    }
}
