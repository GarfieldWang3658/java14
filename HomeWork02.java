package com.hspedu.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car = new Car("宝马",400000);
        Car car2 = new Car("宾利",500000);
        Car car3 = new Car("HONDA",150000);

        arrayList.add(car);
        arrayList.add(car2);
        arrayList.add(car3);

        System.out.println("===add后===");
        System.out.println(arrayList);

        System.out.println("===remove后===");
        arrayList.remove(car3);
        System.out.println(arrayList);

        System.out.println("查找是否有宝马="+arrayList.contains(car));

        System.out.println("有多少辆车="+arrayList.size());

        System.out.println("判断是否为空？"+arrayList.isEmpty());//F

        arrayList.clear();
        System.out.println("清空元素后="+arrayList);

        arrayList.add(car);
        arrayList.addAll(arrayList);
        System.out.println("添加多个元素后="+arrayList);

        arrayList.containsAll(arrayList);//T

        arrayList.removeAll(arrayList);//相当于清空
        System.out.println("删除多个元素后="+arrayList);



        arrayList.add(car);
        arrayList.add(car2);
        arrayList.add(car3);

        System.out.println("===增强for遍历===");

        for (Object o :arrayList) {
            System.out.println(o);
        }

        System.out.println("===迭代器遍历===");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }


    }
}
class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}