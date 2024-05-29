package com.single;

/**
 *  一般情况下，类如果能直接全局生效，可以直接将他加载。而如果有时候是到达了某个条件才会产生，比如用户到了一个级别，或者到了一个时间点，才会创建，那么这个时候就需要懒加载。
 *
 *
 *
 *
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
