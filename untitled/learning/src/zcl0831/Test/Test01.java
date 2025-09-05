package zcl0831.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");
        //使用Random实现随机
        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);

        //使用Collections.shuffle实现随机
        Collections.shuffle(list);
        System.out.println(list.get(1));
    }
}
