package zcl0831.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加数据
        Collections.addAll(list, 1,1,1,1,1,1,1);
        Collections.addAll(list, 0,0,0);
        //打乱
        Collections.shuffle(list);
        //随机
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);

        //创建两个集合分别存储男生和女生名字
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        Collections.addAll(boys, "张三", "李四", "王五", "赵六", "小七", "小八", "小九", "小十");
        Collections.addAll(girls, "小A", "小B", "小C", "小D", "小E", "小F", "小G", "小H");

        Collections.shuffle(boys);
        if(number == 1) {
            //System.out.println(boys.get(0));
            Random r1 = new Random();
            int index1 = r1.nextInt(boys.size());
            System.out.println(boys.get(index1));
        }else{
            Random r2 = new Random();
            int index2 = r2.nextInt(girls.size());
            System.out.println(girls.get(index2));
        }
    }
}

/*
题目： 自动点名器
要求：
70概率随机男生
30概率随机女生
 */