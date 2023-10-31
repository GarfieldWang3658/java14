package com.hspedu.map_;

import java.util.*;

public class MapFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", new BOOK("",100));//OK
        map.put("邓超","孙俪");//替换
        map.put("王宝强","马蓉");//ok
        map.put("宋喆","马蓉");//ok
        map.put("刘令博",null);//ok
        map.put(null,"刘亦菲");//ok
        map.put("鹿晗","关晓彤");//ok

        Set keyset = map.keySet();
        //1,增强for
        System.out.println("===第一种方式===");
        for (Object key :keyset) {
            System.out.println(key+"-"+map.get(key));
        }

        //2、迭代器
        System.out.println("===第二种方式===");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key+"-"+map.get(key));
        }

        //第二组，把所有的values取出
        Collection values = map.values();
        //1、增强for循环
        System.out.println("===取出所有的value-使用增强for===");
        for (Object value :values) {
            System.out.println(value);
        }
        //2、迭代器
        System.out.println("===取出所有的value-使用迭代器===");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }

        //第三组，通过EntrySet来获取 key-value
        Set entrySet = map.entrySet();//EntrySet<Map.Entry<K,V>>
        //1、增强for
        System.out.println("===使用EntrySet的for增强(第三种)===");
        for (Object entry :entrySet) {
            //将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        //迭代器
        System.out.println("===使用EntrySet的迭代器（第四种）");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            //System.out.println(next.getClass());
            //HashMap$Node->实现->Map.Entry(getKey,getValue);
            //向下转型 Map.Entry
            Map.Entry m =(Map.Entry)entry;
            System.out.println(m.getKey()+"-"+m.getValue());

        }
    }
}
