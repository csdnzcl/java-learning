package zcl0831;

import java.util.ArrayList;
import java.util.Collections;
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}

/*
Collections不是集合，是集合的工具类
public static <T> boolean addAll (Collection<T> c, T... elements)    像c中批量添加元素
public static void shuffle(List<?> list)        打乱 List 集合元素的顺序
 */