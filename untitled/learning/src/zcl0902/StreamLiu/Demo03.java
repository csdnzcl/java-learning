package zcl0902.StreamLiu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "eee");
        //forEach
        list.stream().forEach(s -> {System.out.println(s);});
        System.out.println("----------------");

        //long count();
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("----------------");
        //toArray
        Object[] array = list.stream().toArray();
        System.out.println( Arrays.toString(array));
        System.out.println("----------------");
        //IntFunction的泛型：具体类型的数组
        //apply形参：流中数据个数
        //apply返回值：具体类型的数组
        //方法体：创建数组
        /*String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));*/

        //理解
        /*
        toArray()方法：
        参数：负责创建一个指定类型的数组
        底层：依次得到流里面的每一个数据，并把数据放到数组当中
        返回值：装着流所有数据的数组
         */
        //lambda表达式
        String[] array1 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array1));
    }
}

/*
Stream的终结方法：使用终结方法，会结束Stream操作
1.forEach(Consumer c)---遍历
2. long count()---统计个数
3.toArray()---返回一个Object数组
4.collect()---将元素收集到一个集合中
 */

//Arrays.toString()方法：将数组转换成字符串