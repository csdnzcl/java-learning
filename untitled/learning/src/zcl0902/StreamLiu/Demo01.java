package zcl0902.StreamLiu;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        //单列集合获取Stream流----list.stream()
        /*
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "eee");
        //1. 获取Stream流
        Stream<String> stream1 = list.stream();
        stream1.forEach((s) -> {System.out.println(s);});
        System.out.println("----------------");
        //链式调用
        list.stream().forEach(s -> System.out.println(s));*/

        //双列集合获取Stream流---hm.keySet.stream()  //hm.entrySet.stream()
        /*HashMap<String, Integer> hm = new HashMap<>();
        hm.put("张三", 100);
        hm.put("李四", 80);
        hm.put("王五", 90);
        hm.put("赵六", 70);
        hm.put("田七", 60);*/
        //第一种获取Stream流---获取键
        /*hm.keySet().stream().forEach(s -> System.out.println(s));
        System.out.println("----------------");*/
        //第二种获取Stream流---获取键值对
        //hm.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //数组获取Stream流---Arrays.stream(arr)
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        String [] arr1 = {"a", "b", "c", "d", "e"};
//        //获取Stream流
//        Arrays.stream( arr).forEach(i -> System.out.println(i));
//        System.out.println("----------------");
//        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        //一堆零散数据获取Stream流
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(i -> System.out.println(i));


    }
}
/*
Stream流：
1. 获取方式：
单列集合： defult Stream<E>   stream()   --Collection中默认方法
双列集合：无法直接获得，利用Entry对象变单列或者利用keySet()获取键的集合
数组： public static<T> Stream<T> stream(T[] array)    Array工具类中静态方法
一堆零散数据 public static<T> Stream<T>of(T...values)   Stream接口中静态方法
 */

//获取的stream流只能使用一次，且不影响原集合
