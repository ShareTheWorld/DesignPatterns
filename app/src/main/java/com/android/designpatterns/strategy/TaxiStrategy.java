package com.android.designpatterns.strategy;

/**
 * Created by user on 17-2-15.
 */

public class TaxiStrategy implements CalculateStrategy {
    @Override
    public double calculatePrice(double km) {
        return km*2;
    }
}
