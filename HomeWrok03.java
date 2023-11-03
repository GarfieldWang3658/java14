package com.hspedu.homework;

import java.util.*;

public class HomeWrok03 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        System.out.println(m);
        System.out.println("===修改jack工资后===");
        m.put("jack",2600);
        System.out.println(m);
        System.out.println("===所有员工+100工资===");
        //keyset
        Set keySet = m.keySet();
        for (Object o :keySet) {
            m.put(o,(Integer)m.get(o)+100);
        }
        System.out.println(m);

        //遍历 entryset
        System.out.println("===遍历,使用entryset===");
        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        System.out.println("===遍历工资===");
        Collection values = m.values();
        for (Object o : m.values()) {
            System.out.println("工资="+o);
        }


    }
}

