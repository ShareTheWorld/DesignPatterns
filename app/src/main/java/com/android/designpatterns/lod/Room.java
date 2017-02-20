package com.android.designpatterns.lod;

/**
 * Created by user on 17-2-11.
 */

public class Room {
    public double area;
    public float price;
    public Room(float area,float price){
        this.area=area;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Room [area="+area+", price="+price+"]";
    }
}
