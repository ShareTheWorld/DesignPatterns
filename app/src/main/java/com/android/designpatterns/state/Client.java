package com.android.designpatterns.state;

/**
 * Created by user on 17-2-15.
 */

public class Client {
    public static void main(String args[]){
        TvController tvController=new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnDown();
        tvController.powerOff();;
        tvController.turnDown();
    }
}
