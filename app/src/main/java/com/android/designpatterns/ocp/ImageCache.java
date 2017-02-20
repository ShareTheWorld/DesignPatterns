package com.android.designpatterns.ocp;

import android.graphics.Bitmap;

/**
 * Created by user on 17-2-10.
 */

public interface ImageCache {
    public Bitmap get(String url);
    public void put(String url,Bitmap bitmap);
}
