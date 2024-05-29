package com.factory;

import com.factory.good.Good;
import com.factory.good.GoodTypeEnum;

/**
 * 工厂模式，就是一般是一类产品，然后通过每个产品工厂进行创建实例
 * 抽象工厂，就是产品族，使用工厂的工厂
 *
 *
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
