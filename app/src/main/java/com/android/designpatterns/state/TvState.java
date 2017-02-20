package com.android.designpatterns.state;

/**
 * Created by user on 17-2-15.
 */

public interface TvState {
    public void nextChannel();
    public void prevChannel();
    public void turnUp();
    public void turnDown();
}
