package com.hspedu.collection_;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col =new ArrayList();

        col.add(new Book_("三国演义","罗贯中",10.1));
        col.add(new Book_("小李飞刀","古龙",5.1));
        col.add(new Book_("红楼梦","曹雪芹",34.6));

        System.out.println("col="+col);
        //遍历col集合
        //1、先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2、使用while循环遍历
//        while (iterator.hasNext()){
//            //判断集合内是否还有数据
//            //返回下一个元素，类型是Object
//            Object obj = iterator.next();
//            System.out.println("obj="+obj);
//        }
        //快捷键，快速生成while=》itit
        //显示所有快捷键 ctrl+j
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj="+obj);
        }
        //3、退出while循环后，这时iterator迭代器，指向了最后一个元素
        //iterator.next();
        //4、如果需要再次遍历，需要重置迭代器
        iterator = col.iterator();//重置迭代器
        System.out.println("===第二次遍历===");
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj="+obj);
        }


    }
}
class Book_ {
    private String name;
    private String author;
    private double price;

    public Book_(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book_{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
