package zcl0903.streamTest;

import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("------------------");

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三-15","王五-16","赵六-17","孙七-18","张三-18","王五-21");
        Map<String, Integer> map = list1.stream().filter(s -> Integer.parseInt(s.split("-")[1]) >= 18)
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[1])));
        System.out.println(map);
        System.out.println("------------------");

    }
}
