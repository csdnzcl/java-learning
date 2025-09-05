package zcl0902.StreamLiu;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo02 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "张三丰", "周芷若","赵敏", "张强", "张翠山","张亮", "王麻子");
        //filter  过滤， 把张开头的留下，其余数据过滤不要
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
                /*----原理-------
                返回值是true，则数据留下
                返回false，数据过滤      */
//                return s.startsWith("张");
//            }
//        }).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("张"))
                .forEach(s -> System.out.println(s));
        System.out.println("--------------------------------");
        //limit---截取前几个数据
        list.stream().limit(3)
                .forEach(s -> System.out.println(s));
        System.out.println("--------------------------------");
        // skip---跳过前几个数据
        list.stream().skip(3)
                .forEach(s -> System.out.println(s));
        System.out.println("--------------------------------");

        //distinct---去重
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌","张无忌","张无忌", "张三丰", "周芷若","周芷若","周芷若","周芷若","赵敏", "张强", "张翠山","张亮", "王麻子");
        list1.stream().distinct()
                .forEach(s -> System.out.println(s));
        System.out.println("--------------------------------");
        //map---转换
        /*
        apply的形参s:依次表示流的每个数据
        返回值：表示转换后的数据
         */
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张无忌-15", "张三丰-20", "周芷若-25","赵敏-30", "张强-35", "张翠山-40","张亮-45", "王麻子-50");
        list2.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] split = s.split("-");
                String ageString = split[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(age -> System.out.println(age));
        System.out.println("--------------------------------");
        //map简化写法
        list2.stream().map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(age -> System.out.println(age));
    }
}


/*
Stream流的中间方法:
1.filter(Predicate p)---过滤
2.limit(long n)---获取前几个元素
3.skip(long n)---跳过前几个元素
4.distinct()---去重(依赖hashCode和equals)
5.concat(Stream a,stream b)---合并流a,b
6.map(Function f)---转换流中的数据类型
 */