package com.android.designpatterns.ocp;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by user on 17-2-10.
 */

public class MemoryCache implements ImageCache {
    private LruCache<String,Bitmap> mMemeryCache;

    public MemoryCache(){

    }
    @Override
    public Bitmap get(String url) {
        return null;
    }

    @Override
    public void put(String url, Bitmap bitmap) {

    }
}
