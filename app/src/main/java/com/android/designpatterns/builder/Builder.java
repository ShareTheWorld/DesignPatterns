package com.android.designpatterns.builder;

/**
 * Created by user on 17-2-12.
 */
public abstract class Builder {
    public abstract void buildBoard(String board);
    public abstract void buildDisplay(String display);
    public abstract void buildOS();
    public abstract Computer create();
}
