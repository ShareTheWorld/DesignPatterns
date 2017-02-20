package com.android.designpatterns.prototype;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 17-2-12.
 */

public class Test {
    public static void main(String []args){
        WordDocument doc=new WordDocument();
        doc.setmText("Clone WordDocument");
        ArrayList<String> list=new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        doc.setList(list);
        list.add("list 3");
        System.out.println(doc.toString());
        WordDocument docClone=doc.clone();
        System.out.println(docClone.toString());

        System.out.println("*****************");

        doc.setmText("Cone 1");
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("list 1");
        list2.add("list 2");
        docClone.setList(list2);
        System.out.println(doc.toString());
        System.out.println(docClone.toString());


    }
}
