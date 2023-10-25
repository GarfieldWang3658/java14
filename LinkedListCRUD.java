package com.hspedu.list_;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        linkedList.remove();
        //1、执行 removeFirst
        /*
        public E remove() {
        return removeFirst();}
         */
        //2、执行
        /*
        public E removeFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst(f);}
         */
        //3、执行 unlinkFirst，将f指向的双向链表的第一个结点拿掉。
        /*
        private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        return element;
    }
         */

        System.out.println(linkedList);

        //源码阅读
        //1、LinkedList linkedList = new LinkedList();对应的如下：
        /*
           public LinkedList() {}
         */
        //2、这时：linkedlist 的属性 first=null；lasat=null；
        //3、执行了add方法
        /*
        public boolean add(E e) {
            linkLast(e);
            return true;
        }
         */
        //4、将新的结点，加入到双向链表的最后。
        /*
            void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }
         */
        System.out.println("===");
        for (int i = 1; i < 2; i++) {
            linkedList.add(i);
        }
        linkedList.add(100);
        linkedList.add(100);
        for (Object object :linkedList) {
            System.out.println(object);
        }

        //修改某个结点
        linkedList.set(0,"hspedu");
        System.out.println("===");
        for (Object object :linkedList) {
            System.out.println(object);
        }
        //得到某个结点对象
        //get（1）是得到双向链表的第二个对象
        Object object = linkedList.get(0);
        System.out.println(object);

        //linkedlist实现了list接口，所以遍历方式可以是增强fro循环
        System.out.println("===迭代器遍历===");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next="+next);
        }
        System.out.println("===增强for遍历===");
        for (Object o :linkedList) {
            System.out.println(o);
        }
        System.out.println("===普通for遍历===");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }


        System.out.println(linkedList.getFirst());
    }
}
