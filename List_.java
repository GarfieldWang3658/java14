package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1、List集合类中元素有序（即添加顺序和去除顺序一致），且可重复
        List list = new ArrayList();
        list.add("tom");
        list.add("jack");
        list.add("marry");
        list.add("tanaka");
        list.add("wang");
        list.add("lee");
        System.out.println(list);

        System.out.println(list.get(3));

    }
}
