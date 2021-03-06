package com.android.designpatterns.builder;

/**
 * Created by user on 17-2-12.
 */

public class MacbookBuilder extends Builder{
    private Computer mComputer=new Macbook();
    @Override
    public void buildBoard(String board) {
        mComputer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setmDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
