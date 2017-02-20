package com.android.designpatterns.builder;

import android.content.Context;

/**
 * Created by user on 17-2-12.
 */

public class Macbook extends Computer {
    public Macbook() {
    }

    @Override
    public void setOS() {
        mOS="Mac OS X 10.10";
    }
}
