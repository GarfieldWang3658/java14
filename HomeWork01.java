package com.hspedu.homework;

import java.util.ArrayList;

public class HomeWork01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引起民众担扰","") );
        arrayList.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起来一看赶紧放生","") );

        for (int i = arrayList.size()-1; i >=0 ; i--) {
            News news = (News)arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));

        }

    }
    //专门写一个方法，处理显示新闻标题。
    public static String processTitle(String title){
        if (title==null){
            return "";
        }
        if (title.length()>15){
            return title.substring(0,15)+"...";//[0,15)
        }else {
            return title;
        }
    }
}
class News{
    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
