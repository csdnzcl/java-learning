package zcl0903;

import java.util.*;
import java.util.stream.Collectors;

public class StreamLiu {
    public static void main(String[] args) {
        /*终结方法
        collect(Collector collector)---收集流中数据放到集合中（List，Set，Map）
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "赵敏-女-18", "小昭-女-16", "张三丰-男-97", "张良-男-27", "小圆-女-19", "小李-男-20", "小王-男-21");

        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .filter(s -> s.split("-")[0].startsWith("张"))
                .collect(Collectors.toList());
        System.out.println(newList);

        System.out.println("--------------------------------");
        //使用Set
        Set<String> newSet = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newSet);
        System.out.println("--------------------------------");
        //使用Map-----键不能重复--报错
        Map<String, String> newMap = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> s.split("-")[2]));
        System.out.println(newMap);
    }
}
