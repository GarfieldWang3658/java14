package com.hspedu.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_ {
    @SuppressWarnings({"ALL"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");


        //reverse(List)：反转List中的元素排序
        Collections.reverse(list);
        System.out.println(list);
        //shuffle(List)：对List集合元素进行

        Collections.shuffle(list);
        System.out.println(list);

        //sort(List):根据元素的自然顺序对指定List集合元素按照升序排序
        Collections.sort(list);
        System.out.println("自然排序后");
        System.out.println(list);

        //sort(list,Comparator):根据指定的Comparator产生的顺序对List集合元素进行排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //可以加入校验代码
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("===字符串长度大小排序===");
        System.out.println(list);

        //swap(List,int,int)：将指定List集合中的i处元素和j处元素进行交换
        Collections.swap(list,0,1);
        System.out.println("===交换后的list===");
        System.out.println(list);

        //Object max(Collection)：根据元素的自然顺序，返回给定集合中最大的元素
        System.out.println("自然顺序最大的元素="+Collections.max(list));

        //Object max(Collection,Comparator):根据Comparator 指定的顺序，返回给定集合中的最大元素
        //返回长度最大的元素
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("长度最大的元素="+maxObject);

        //Object min(Collection)
        //Object min(Collection,Comparator)
        //参考max即可

        //int frequency(Collection,Object)：返回指定集合中指定元素的出现次数
        System.out.println("tom出现的次数="+Collections.frequency(list,"tom"));

        //void copy(List dest,List src)：将src中的内容赋值到dest中

        ArrayList dest = new ArrayList();
        //为了完成一个完整的拷贝，需要献给dest赋值，大小和list.size()一样
        //拷贝
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println(dest);

        //boolean replaceAll(List list，Object oldVal,Object newVal)：使用新值替换List对象的所有旧值
        //如果list中有tom就替换成汤姆
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println(list);


    }
}
