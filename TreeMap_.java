package com.hspedu.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
       // TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
                //return ((String)o2).length() -((String)o1).length();

            }
        });

        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("kristina","克瑞斯提诺");
        treeMap.put("Simth","史密斯");
        treeMap.put("hsp","韩顺平");//根据比较的规范

        System.out.println(treeMap);
        /*
        1、构构造器，把传入的实现了Comparator 接口的匿名内部类（对象）
        传给了TreeMap的comparator
            public TreeMap(Comparator<? super K> comparator) {
        this.comparator = comparator;
        }
        2、调用put方法
        第一次添加,把key-value 封装到entry对象中，放入 root
        Entry<K,V> t = root;
        if (t == null) {
        comparator(key,key);//type(and possibly null)check

            root = new Entry<>(key,value,null)
            size = 1;
            modCount++;
            return null;
        }
        2.2以后添加
         Comparator<? super K> cpr = comparator;
         if (cpr != null) {
            do {//遍历所有key，给当前的key寻找适当位置，
                parent = t;
                cmp = cpr.compare(key, t.key);//动态绑定到匿名内部类的compare方法
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else {//如果遍历过程中，发现准备添加key和当前已有的key相等，就不添加
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
