package com.factory;

import com.factory.good.Good;
import com.factory.good.ShoesGood;
import com.factory.phone.Phone;
import com.factory.phone.XiaomiPhone;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/22 17:27
 * @Description:
 */
public class OrdinaryFactory extends GoodFactory{
    @Override
    Good createGood() {
        return new ShoesGood();
    }
    Phone createPhone(){
        return new XiaomiPhone();
    }
}
