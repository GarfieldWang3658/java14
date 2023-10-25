package com.hspedu.set_;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1、以Set接口的实现类 HashSet 来讲解Set 接口的方法
        //2、set接口的实现类的对象（set接口对象），不能存放重复的元素，可以添加一个null
        //3、set接口对象存放的数据是无序的（即添加的顺序和取出的顺序不一致）
        //4、注意：取出的顺序，虽然不是添加的顺序，但是是固定的。

        Set set = new HashSet();
        set.add("jhon");
        set.add("lucy");
        set.add("jhon");
        set.add("jack");
        set.add(null);
        set.add(null);
        System.out.println(set);

        System.out.println("===remove===");
        set.remove(null);
        System.out.println(set);

        //遍历方式

        System.out.println("===迭代器遍历===");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        System.out.println("===增强for遍历===");

        for (Object o :set) {
            System.out.println(o);
        }



        //

    }
}
