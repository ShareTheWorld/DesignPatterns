package com.android.designpatterns.factory;

/**
 * Created by user on 17-2-13.
 */

public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println(" Q5 启动拉");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5 开始自巡航了");
    }
}
