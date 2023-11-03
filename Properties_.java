package com.hspedu.map_;

import java.util.Properties;

public class Properties_ {
        @SuppressWarnings({"all"})
        public static void main(String[] args) {
            Properties properties = new Properties();
            //1、properties 类继承 Hashtable
            //2、可以通过k-v存放数据，key和value不能为null

            //增加
            properties.put("jhon",100);
//        properties.put(null,100);
//        properties.put("jhon",null);
            properties.put("lucy",100);
            properties.put("lic",100);
            properties.put("lic",88);//如果有相同的key，value 会被替换。
            System.out.println(properties);

            //获取
            System.out.println(properties.get("lic"));

            //删除
            properties.remove("lic");
            System.out.println(properties);

            //修改
            properties.put("jhon","约翰");
            System.out.println(properties);



        }
}
