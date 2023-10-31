package com.hspedu.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Object jack = hashMap.put("1", new Emp("jack", "1", 300000));
        Object tom = hashMap.put("2", new Emp("tom", "2", 23000));
        Object milan = hashMap.put("3", new Emp("milan", "3", 13000));

        Set keySet = hashMap.keySet();
        //使用keySet - 》 增强for
        System.out.println("===第一种遍历方式===");
        for (Object Emp1 : hashMap.keySet()) {
            //先获取value
            Emp emp = (Emp) hashMap.get(Emp1);
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
        System.out.println("===第二种方式===");
        //使用EntrySet->迭代器

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object entry = iterator.next();
            Map.Entry entry1 = (Map.Entry) entry;
            Emp emp2 = (Emp) entry1.getValue();
            if (emp2.getSal() > 18000) {
                System.out.println(emp2);
            }


        }
    }
}
class Emp{
    private String name;
    private String id;
    private double sal;

    public Emp(String name, String id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sal=" + sal +
                '}';
    }
}
