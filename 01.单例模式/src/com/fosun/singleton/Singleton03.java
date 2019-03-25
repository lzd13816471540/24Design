package com.fosun.singleton;

public class Singleton03 {

    /**
     * 双重检查模式
     */
    private static Singleton03 singleton03;

    private Singleton03(){}

    public static Singleton03 getInstance(){
        if(singleton03 == null){
            synchronized (Singleton03.class){
                singleton03 = new Singleton03();
            }
        }
        return singleton03;
    }

    public static void main(String[] args) {
        Singleton03 instance = Singleton03.getInstance();

        System.out.println(instance);

        Singleton03 instance1 = Singleton03.getInstance();

        System.out.println(instance == instance1);
    }
}
