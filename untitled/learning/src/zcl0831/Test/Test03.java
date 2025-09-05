package zcl0831.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "eee");
        int count = 0;
        while(true){
            if(list.size() == 0){
                Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "eee");
            }
            Random r = new Random();
            int index  = r.nextInt(list.size());
            System.out.println(list.remove(index));
            count++;
            if(count == 20){
                break;
            }
        }
    }
}
/*
自动点名器需求：（以五个学生为例）
被点到的学生不会再被点到
如果班级中的所有学生都点完了，需要重新开始第二轮点名
 */