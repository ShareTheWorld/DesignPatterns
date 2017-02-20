package com.android.designpatterns.srp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by user on 17-2-10.
 */

public class ImageLoader {
    ImageCache mImageCache=new ImageCache();
    ExecutorService mExecutorService= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public void displayimage(final String url, final ImageView imageView){
        Bitmap bitmap=mImageCache.get(url);
        if(bitmap!=null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap=downloadImage(url);
                if(bitmap==null){
                    return;
                }
                if(imageView.getTag().equals(url)){
                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(url,bitmap);
            }
        });
    }
    public Bitmap downloadImage(String imageUrl){
        Bitmap bitmap=null;
        try{
            URL url=new URL(imageUrl);
            final HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            bitmap= BitmapFactory.decodeStream(conn.getInputStream());
        }catch (Exception e){
            e.printStackTrace();
        }
        return bitmap;
    }
}
