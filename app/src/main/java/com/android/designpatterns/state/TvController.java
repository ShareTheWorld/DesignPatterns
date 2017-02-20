package com.android.designpatterns.state;

/**
 * Created by user on 17-2-15.
 */

public class TvController implements PowerController {
    TvState mTvState;

    public void setmTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    @Override
    public void powerOn() {
        setmTvState(new PowerOnState());
        System.out.println("开机拉");
    }

    @Override
    public void powerOff() {
        setmTvState(new PowerOffState());
        System.out.println("关机拉");
    }
    public void nextChannel(){
        mTvState.nextChannel();
    }
    public void prevChannel(){
        mTvState.nextChannel();
    }
    public void turnUp(){
        mTvState.turnUp();
    }
    public void turnDown(){
        mTvState.turnDown();
    }
}
