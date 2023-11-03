package com.hspedu.map_;

import java.util.Hashtable;

public class HashTableExercis {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();//OK
        hashtable.put("jhon",100);//OK
//        hashtable.put(null,100);//异常
//        hashtable.put("jhon",null);//异常
        hashtable.put("lucy",100);//OK
        hashtable.put("lic",100);//OK
        hashtable.put("lic",88);//替换
        hashtable.put("hello1",1);
        hashtable.put("hello2",1);
        hashtable.put("hello3",1);
        hashtable.put("hello4",1);
        hashtable.put("hello5",1);
        hashtable.put("hello6",1);
        hashtable.put("hello7",1);
        hashtable.put("hello8",1);

        System.out.println(hashtable);
        //1、底层有数组 Hashtable$Entry[]初始大小为11
        //2、临界值 threshold = 8 =11*0.75
        //3、扩容按照自有机制
        //4、执行方法 addEntry(has,key,value,inedex);添加k-v封装到Entry
        //5、当 if(count >= threshold)满足时就进行扩容，
        //6、按照 int newCapacity = （oldCapacity << 1）+1;的大小扩容 => 原容量*2+1


    }
}
