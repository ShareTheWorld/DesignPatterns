package com.android.designpatterns.builder;

/**
 * Created by user on 17-2-12.
 */

public class Test {
    public static void main(String args[]){
        Builder builder =new MacbookBuilder();
        Director pcDirector=new Director(builder);
        pcDirector.construct("因特尔主板","Retina显示器");
        System.out.println("Computer Info :" +builder.create().toString());
    }
}
