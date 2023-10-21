package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        1、add 添加单个元素
//        2、remove 删除指定元素
//        3、contaims 查找元素是否存在
//        4、size 获取元素个数
//        5、isEmpty 判断是否为空
//        6、clear 清空
//        7、addAll 添加多个元素
//        8、containsAll 查找多个元素是否都存在
//        9、removeAll 删除多个元素

        List list = new ArrayList();
        //add添加
        list.add("小龙女");
        list.add(100);
        list.add(true);
        list.add("小龙女");
        list.add(new Integer(10));
        System.out.println("list="+list);
        //remove：删除指定元素；
        list.remove(0);//删除第一个元素
        list.remove("小龙女");//指定删除某个元素
        System.out.println("list="+list);
        //contains：查找元素是否存在
        System.out.println(list.contains("jack"));
        //size 获取元素个数
        System.out.println(list.size());
        //isEmpty 判断是否为空
        System.out.println(list.isEmpty());
        //clear 清空
        list.clear();
        System.out.println(list);
        //addAll 添加多个元素
        List list2 = new ArrayList();
        list2.add("123");
        list2.add("234");
        list.addAll(list2);
        System.out.println(list);
        //containsAll 查找多个元素是否都存在
        System.out.println(list.containsAll(list2));//T
        //removeAll 删除多个元素
        list.removeAll(list2);
        System.out.println(list);








    }
}
