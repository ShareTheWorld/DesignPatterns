package com.android.designpatterns.prototype;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 17-2-12.
 */

public class WordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> list;
    public WordDocument(){
        System.out.println("构造方法");
    }

    @Override
    public WordDocument clone()   {
        WordDocument clone=null;
        try{
            clone=(WordDocument)super.clone();
            clone.mText=this.mText;
            //浅拷贝
            clone.list=this.list;
            //深拷贝
            clone.list=(ArrayList<String>)this.list.clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "WordDocument{" +
                "mText='" + mText + '\'' +
                ", list=" + list +
                '}';
    }
}
