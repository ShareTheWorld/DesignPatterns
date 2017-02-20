package com.android.designpatterns.ocp;

import android.graphics.Bitmap;

/**
 * Created by user on 17-2-10.
 */

public class DoubleCache implements ImageCache {
    ImageCache mMemoryCache = new MemoryCache();
    ImageCache mDiskCache = new DoubleCache();

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap=mMemoryCache.get(url);
        if(bitmap==null){
            bitmap=mDiskCache.get(url);
        }
        return bitmap;
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mMemoryCache.put(url,bitmap);
        mDiskCache.put(url,bitmap);
    }
}
