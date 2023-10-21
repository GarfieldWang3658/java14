package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book_("三国演义", "罗贯中", 10.1));
        col.add(new Book_("小李飞刀", "古龙", 5.1));
        col.add(new Book_("红楼梦", "曹雪芹", 34.6));
        //1、使用增强for循环，在Collection集合中使用
        //2、增强for循环底层仍然是迭代器。
        //3、增强for可以理解成简化版本的迭代器遍历。
        //4、快捷方式 " I "
//        for (Object book:col){
//            System.out.println("book"+book);
        for (Object o :col) {
            System.out.println(o);
        }

        //2、增强for 也可以直接在数组上使用

            int[]nums={1,2,3,4,5,6};
            for (int i : nums){
                System.out.println("i="+i);
            }


        }
    }

