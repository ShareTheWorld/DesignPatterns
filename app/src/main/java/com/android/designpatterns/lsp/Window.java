package com.android.designpatterns.lsp;

/**
 * Created by user on 17-2-10.
 */

public class Window {
    public void show(View child){
        child.draw();
    }
}
