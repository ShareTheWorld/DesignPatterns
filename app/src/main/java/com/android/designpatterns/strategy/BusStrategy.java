package com.android.designpatterns.strategy;

/**
 * Created by user on 17-2-15.
 */

public class BusStrategy implements CalculateStrategy {
    @Override
    public double calculatePrice(double km) {
        double extraTotal =km-10;
        double extraFactorr=extraTotal/5;
        double fraction=extraTotal%5;
        double price=1+extraFactorr*1;
        return fraction>0?++price:price;
    }
}
