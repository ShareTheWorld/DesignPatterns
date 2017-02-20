package com.android.designpatterns.strategy;

/**
 * Created by user on 17-2-15.
 */

public class TranficCalculator {
    public static void main(String args[]){
        TranficCalculator calculator=new TranficCalculator();
        calculator.setStrategy(new BusStrategy());
        System.out.println("公交车乘16公里的价格:"+calculator.calculatePrice(16));
    }
    private CalculateStrategy mStrategy;
    public void setStrategy(CalculateStrategy mStrategy){
        this.mStrategy=mStrategy;
    }
    public double calculatePrice(double km){
        return mStrategy.calculatePrice(km);
    }
}
