package com.hspedu.list_;

import java.util.Vector;

public class Vector_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //无参构造器
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println(vector);
        //1、 new Vector()底层：
        /*
           public Vector() {
        this(10);}
         */
        //补充，如果是有参构造，走的方法为
//    public Vector(int initialCapacity) {
//            this(initialCapacity, 0);
//        }
        //2、vector.add(i)
        //添加数据到vector集合。
        /*
        public synchronized boolean add(E e) {
        modCount++;
        ensureCapacityHelper(elementCount + 1);
        elementData[ elementCount++]=e;
        return true;
         */
        //确定是否需要扩容，条件：minCapacity - elementData.length>0，则需要扩容
        //如果需要的数组大小不沟通，就扩容，扩容的算法。
        //扩容2倍。
//                int oldCapacity = elementData.length;
//        int newCapacity = ArraysSupport.newLength(oldCapacity,
//                minCapacity - oldCapacity, /* minimum growth */
//        capacityIncrement > 0 ? capacityIncrement : oldCapacity
//         preferred growth */);
        //3、如果是无参，默认10，满后，就按2倍扩容。
        //如果指定大小，则每次直接按照2倍扩容。
    }
}
