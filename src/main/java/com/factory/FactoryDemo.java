package com.factory;

import com.factory.good.Good;
import com.factory.good.GoodTypeEnum;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/22 17:28
 * @Description:
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Good good = getGood(GoodTypeEnum.cloth);
        Good shoes = getGood(GoodTypeEnum.shoes);

    }

    public static Good getGood(GoodTypeEnum goodTypeEnum){
        GoodFactory goodFactory;
        if (goodTypeEnum.equals(GoodTypeEnum.cloth)){
            goodFactory = new AiguoFactory();
        }else {
            goodFactory = new OrdinaryFactory();
        }

        return goodFactory.createGood();
    }
}
