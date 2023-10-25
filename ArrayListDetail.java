package com.hspedu.list_;

import java.util.ArrayList;

public class ArrayListDetail {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //ArrayList 是线程不安全的，没有 synchronized
//        public boolean add(E e) {
//            modCount++;
//            add(e, elementData, size);
//            return true;
//        }
        //
        ArrayList list = new ArrayList();
        list.add(null);
        list.add("jack");
        list.add(null);
        list.add(null);
        System.out.println(list);

    }
}
