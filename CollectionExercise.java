package com.hspedu.collection_;

import java.awt.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new DOG("大黄",5));
        list.add(new DOG("小白",6));
        list.add(new DOG("小黑",7));

        System.out.println("===增强for遍历===");

        for (Object Dog :list) {
            System.out.println(Dog);
        }

        System.out.println("===Iterator遍历===");

        Iterator DOG_ = list.iterator();
        while (DOG_.hasNext()){
            Object Dog =DOG_.hasNext();
            System.out.println(list);
            break;
        }

    }
}
class DOG{
    private String name;
    private int age;

    public DOG(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DOG{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
