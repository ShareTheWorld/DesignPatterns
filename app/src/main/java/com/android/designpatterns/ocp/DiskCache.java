package com.android.designpatterns.ocp;

import android.graphics.Bitmap;

/**
 * Created by user on 17-2-10.
 */

public class DiskCache implements ImageCache {
    @Override
    public Bitmap get(String url) {
        /*从本地文件中获取图片*/
        return null;
    }

    @Override
    public void put(String url, Bitmap bitmap) {
//        bitmap.compress(Bitmap.CompressFormat.PNG,100,outstream);
//        将图片写入到文件中
    }
}
