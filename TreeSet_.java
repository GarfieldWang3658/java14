package com.hspedu.set_;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSet_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1、当使用无参构造器创建TreeSet时，是无序的
        //2、使用TreeSet提供的一个构造器，可以传入一个比较器（匿名内部类），
        // 来指定排序规则排序

       // TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面 调用 String的compareTo方法进行字符串大小比较
               // return ((String)o1).compareTo((String) o2);
                return ((String)o1).length()-((String)o2).length();

            }
        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("tom");

        System.out.println(treeSet);
        /*
        1、构造器把传入的比较器对象,赋给了 TreeSet的底层TreeMap的属性this.comparator

            public TreeSet(Comparator<? super E> comparator) {
        this(new TreeMap<>(comparator));    }

        2、在调用treeSet.add 方法时，在底层会执行到
        if (cpr != null) {//cpr 就是匿名内部类（对象）
            do {
                parent = t;
                //动态绑定匿名内部类（对象）compare
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else {//如果相等，即返回0，这个key就没有加入
                    V oldValue = t.value;
                    if (replaceOld || oldValue == null) {
                        t.value = value;
                    }
                    return oldValue;
                }
            } while (t != null);
        }

         */

    }
}
