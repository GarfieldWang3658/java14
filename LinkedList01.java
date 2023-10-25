package com.hspedu.list_;



public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("Tom");
        Node hsp = new Node("hsp");
        //链接三个结点，形成双向链表
        //jack->tom->hsp
        jack.next = tom;
        tom.next = hsp;
        //hsp->tom-jack
        hsp.pre = tom;
        tom.pre = jack;

        Node first = jack;//让first 引用指向jack，就是双向链表的头结点
        Node last = hsp;//让last 引用指向hsp，就是双向链表的尾结点
        //演示从头到尾 进行遍历
        System.out.println("===从头到位进行遍历===");
        while (first != null) {
                System.out.println(first);
                first = first.next;
            }


        System.out.println("===从尾到头遍历===");

        while (last != null) {
                System.out.println(last);
                last = last.pre;
            }
        //双向链表添加/删除输出
        //要求在tom----hsp之间插入一个对象simth

        //1、创建一个Node 结点 name =》smith
        Node smith = new Node("smith");
        smith.next=hsp;
        smith.pre=tom;
        hsp.pre=smith;
        tom.next=smith;

        first = jack;
        System.out.println("===从尾到头遍历===");

        while (first != null) {
                System.out.println(first);
                first = first.next;
            }
        }
    }
//定义一个Node类，Node对象 表示双向链表的一个节点，
class Node{
    public Object item;//真正存放数据
    public Node next;//指向下一个结点
    public Node pre;//指向前一个结点

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name\t"+ item;
    }
}

