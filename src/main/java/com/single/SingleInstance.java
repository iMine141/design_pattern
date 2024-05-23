package com.single;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/23 9:36
 * @Description:
 */
public class SingleInstance {

    //
    private static volatile SingleInstance instance;

    private SingleInstance(){}

    public static SingleInstance getInstance(){
        if (instance == null){
            synchronized (SingleInstance.class){
                if (instance == null){
                    instance = new SingleInstance();
                }
            }
        }
        return instance;
    }
}
