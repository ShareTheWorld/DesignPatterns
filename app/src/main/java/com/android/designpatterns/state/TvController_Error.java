package com.android.designpatterns.state;

/**
 * 状态模式 错误的实现方式
 * Created by user on 17-2-15.
 */

public class TvController_Error {
    private final static int POWER_ON = 1;
    private final static int POWER_OFF = 2;
    private int mState = POWER_OFF;

    public void powerOn() {
        mState = POWER_ON;
        if (mState == POWER_OFF) {
            System.out.println("已经开机了");
        }
    }

    public void powerOff() {
        mState = POWER_OFF;
        if (mState == POWER_ON) {
            System.out.println("已经关机了");
        }
    }

    public void nextChannel() {
        if (mState == POWER_ON) {
            System.out.println("下一频道");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void prevChanel() {
        if (mState == POWER_ON) {
            System.out.println("上一频道");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void turnUp() {
        if (mState == POWER_ON) {
            System.out.println("调高音量");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }
    public void turnDown() {
        if (mState == POWER_ON) {
            System.out.println("调低音量");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }
}
