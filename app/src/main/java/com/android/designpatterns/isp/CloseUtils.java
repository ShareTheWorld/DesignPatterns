package com.android.designpatterns.isp;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by user on 17-2-11.
 */

public class CloseUtils {
    public static void  close(Closeable closeable){
        if(closeable!=null){
            try{
                closeable.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
