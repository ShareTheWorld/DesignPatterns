package com.android.designpatterns.isp;

import android.graphics.Bitmap;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by user on 17-2-11.
 */

public class FileClose {
    public void closeFile1(String url,Bitmap bmp){
        FileOutputStream fileOutputStream=null;
        try{
            fileOutputStream=new FileOutputStream(url);
            bmp.compress(Bitmap.CompressFormat.PNG,100,fileOutputStream);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            if(fileOutputStream!=null){
                try{
                    fileOutputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void closeFile2(String url,Bitmap bmp){
        FileOutputStream fileOutputStream=null;
        try{
            fileOutputStream=new FileOutputStream(url);
            bmp.compress(Bitmap.CompressFormat.PNG,100,fileOutputStream);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
           CloseUtils.close(fileOutputStream);
        }
    }
}
