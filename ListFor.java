package com.hspedu.list_;

import java.util.*;

public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("jack");
        list.add("tom");
        list.add("pizza");
        list.add("回锅肉");
        list.add("米饭");

        //迭代器

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
            
            //增强for
            System.out.println("===增强for===");
            for (Object o :list) {
                System.out.println(o);
                System.out.println("===普通for===");
                for (int i = 0; i <list.size(); i++) {
                    System.out.println(list.get(i));
                    
                }
                
            }

        }

    }
}
