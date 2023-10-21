package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
       List list = new ArrayList();

       list.add("tanaka");
       list.add("yamada");
       list.add("honda");

        //void add(int index,Object ele):在index位置插入ele元素
        //在index=1的位置，插入一个对象
        list.add(1,"hsp");
        System.out.println(list);

        //boolean addAll(int Index,Collection eles):从index位置开始将eles中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("ueno");
        list2.add("miyota");
        list.addAll(1,list2);
        System.out.println(list);

        //Object get(int index)：收获指定index位置的元素。

        //int indexOf(Object obj):返回obj在集合中首次出现的位置。
        System.out.println(list.indexOf("yamada"));//4

        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        list.add("hsp");
        System.out.println(list);
        System.out.println(list.lastIndexOf("hsp"));

        //Object remove(int index)：移除指定index位置的元素，并返回元素
        list.remove(0);
        System.out.println(list);
        //Object set(int index Object ele)：设置指定index位置的元素为ele，相当于替换
        list.set(0,"tanaka");
        System.out.println(list);

        //List subList(int fromIndex,int toIndex):返回从fromIndex到toIndex位置的子集合
        //返回的子集合 fromIndex <= sublist <toIndex
        List relist = list.subList(0, 2);
        System.out.println(relist);

    }
}
