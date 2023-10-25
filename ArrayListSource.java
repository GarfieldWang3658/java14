package com.hspedu.list_;

import java.util.ArrayList;

public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //IDEA默认情况下 Debug显示的数据是简化后的，所以有些数据看不到，
        //如需要看到完整数据，需要做设置。
        //使用无参构造器创建ArrayList对象
        //ArrayList list = new ArrayList();
        ArrayList list = new ArrayList(8);
        //使用for循环给list集合添加1-10数据
        for (int i = 1; i <=10; i++) {
            list.add(i);

        }
        //使用for循环给list集合添加11-15的数据
        for (int i = 11; i <=15 ; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        for (Object object :list) {
            System.out.println(object);
        }

    }
}
