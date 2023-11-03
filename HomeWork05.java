package com.hspedu.homework;

import java.util.Comparator;
import java.util.TreeSet;

public class HomeWork05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());
        //add 方法，因为TreeSet() 构造器没有传入Compatator接口的匿名内部类，
        //所以在底层，会把Person对象转成Comparable类型，所以会抛出异常
        //class cast exception

        System.out.println(treeSet);
    }
}
//解决办法，实现Comparable接口,重写compareTo方法
class Person implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
