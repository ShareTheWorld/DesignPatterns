package com.android.designpatterns.builder;

/**
 * Created by user on 17-2-12.
 */

public class Director {
    Builder mBuilder=null;
    public Director(Builder builder){
        mBuilder=builder;
    }
    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
