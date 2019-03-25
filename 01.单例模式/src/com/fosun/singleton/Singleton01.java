package com.fosun.singleton;

/**
 * @description 单例模式
 * @author zhidong.li
 * @date 2019.3.25
 *
 */
public class Singleton01 {

    /**
     * 饿汉式:
     *      私有化构造函数
     *      提供静态常量实例化对象
     *      提供静态方法获取单例对象
     */

    private static final Singleton01 SINGLETON_01 = new Singleton01();

    private Singleton01(){}

    public static Singleton01 getInstance(){
        return SINGLETON_01;
    }

    public static void main(String[] args) {
        Singleton01 instance = Singleton01.getInstance();

        Singleton01 instance1 = Singleton01.getInstance();

        System.out.println(instance == instance1);
    }
}
