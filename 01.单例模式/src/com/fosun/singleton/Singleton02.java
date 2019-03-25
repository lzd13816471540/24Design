package com.fosun.singleton;

public class Singleton02 {

    /**
     * 懒汉式:  线程不安全
     *
     */
    private static Singleton02 SINGLETON_02 ;

    private Singleton02(){}

    public static Singleton02 getInstance(){
        if(SINGLETON_02 == null){
            SINGLETON_02 = new Singleton02();
        }
        return SINGLETON_02;
    }


    public static void main(String[] args) {
        Singleton02 instance = Singleton02.getInstance();

        System.out.println(instance);

        Singleton02 instance1 = Singleton02.getInstance();

        System.out.println(instance1);

        System.out.println(instance == instance1);
    }
}
