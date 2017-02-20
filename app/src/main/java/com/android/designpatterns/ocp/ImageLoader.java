package com.android.designpatterns.ocp;

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
    ImageCache mImageCache=new MemoryCache();
    ExecutorService mExceutorService= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public void setImageCache(ImageCache imageCache){
        this.mImageCache=imageCache;
    }
    public void displayImage(String imageUrl,ImageView imageView){
        Bitmap bitmap=mImageCache.get(imageUrl);
        if(bitmap!=null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        submitLoadRequest(imageUrl,imageView);
    }
    private void submitLoadRequest(final String imageUrl,final ImageView imageView){
        imageView.setTag(imageUrl);
        mExceutorService.submit(new Runnable(){
            @Override
            public void run(){
                Bitmap bitmap=downloadImage(imageUrl);
                if(bitmap==null){
                    return;
                }
                if (imageView.getTag().equals(imageUrl)) {

                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(imageUrl,bitmap);
            }
        });
    }

    public Bitmap downloadImage(String imageUrl){
        Bitmap bitmap=null;
        try {
            URL url = new URL(imageUrl);
            final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
        return bitmap;
    }
}
