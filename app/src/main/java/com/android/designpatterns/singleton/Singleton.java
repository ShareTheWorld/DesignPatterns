package com.android.designpatterns.singleton;

/**
 * Created by user on 17-2-11.
 */

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }
}
