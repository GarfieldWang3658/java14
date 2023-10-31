package com.hspedu.map_;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

public class MapMethod {
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
        map.put("hsp","laopo");

        System.out.println(map);

        //remove，根据 KEY 删除映射关系
        map.remove(null);
        System.out.println(map);

        //get:根据KEY来获取值
        Object val = map.get("鹿晗");
        System.out.println( val);

        //size:获取元素个数
        System.out.println(map.size());

        //isEmpty:判断个数是否为0
        System.out.println(map.isEmpty());

        //claer 清除
        map.clear();
        System.out.println(map);

        //containsKey 查找KEY是否存在
        System.out.println(map.containsKey("hsp"));

        //





    }
}
class BOOK{
    private String name;
    private int num;

    public BOOK(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
