package com.android.designpatterns.command;

/**
 * Created by user on 17-2-20.
 */

public class TetrisMachine {
    public void toLeft(){
        System.out.println("向左");
    }
    public void toRight(){
        System.out.println("向右");
    }
    public void fastToBottom(){
        System.out.println("快速落下");
    }
    public void transform(){
        System.out.println("改变形状");
    }
}
