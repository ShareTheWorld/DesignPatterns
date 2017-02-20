package com.android.designpatterns.strategy;

/**
 * Created by user on 17-2-15.
 */

public class SbuwayStrategy implements CalculateStrategy {
    @Override
    public double calculatePrice(double km) {
        if(km<=6){
            return 3;
        }else if(km>6 && km<12){
            return 4;
        }else if(km>12 && km <22){
            return 5;
        }else if(km >22 && km <32){
            return 6;
        }
        return 7;
    }
}
