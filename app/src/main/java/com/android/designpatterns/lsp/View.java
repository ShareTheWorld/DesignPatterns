package com.android.designpatterns.lsp;

/**
 * Created by user on 17-2-10.
 */

public abstract class View {
    public abstract void draw();
    public void measure(int width,int height){
        //测量视图大小
    }
}
