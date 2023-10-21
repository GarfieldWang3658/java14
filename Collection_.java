package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Collection_ {
    public static void main(String[] args) {
        @SuppressWarnings({"all"})

        //1、集合主要分两组（单列集合）（双列集合）
        //2、Collection接口有两个重要的子接口，【List】和【Set】，他们的实现子类都是单列集合
        //3、Map 接口的实现子类 是双列集合，存放的是K-V
        //4、体系图重要！！！
        //Collection
        //Map
        //
        ArrayList arrayList =  new ArrayList();
        arrayList.add("jack");
        arrayList.add("wang");

        HashMap hashMap = new HashMap();
        hashMap.put("No.1","北京");
        hashMap.put("No.2","上海");





    }
}
