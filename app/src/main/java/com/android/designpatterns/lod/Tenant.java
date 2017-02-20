package com.android.designpatterns.lod;

/**
 * Created by user on 17-2-11.
 */

public class Tenant {
    public double roomArea;
    public float roomPrice;
    public static final double diffPrice=100.00001;
    public static final double diffArea=0.00001;
    public void rentRoom(Mediator mediator){
        System.out.println("租到房啦"+mediator.rentOut(roomArea,roomPrice));
    }
}
