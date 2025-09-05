package zcl0902.ImmutableCollection;

import java.util.*;

public class Immutable {
    public static void main(String[] args) {
        /*
        创建Map的不可变集合
            细节：键不能重复，Map的of方法参数是有上限的，最多20个参数，10个键值对
         */
        Map<String, String> map = Map.of("张三","南京","李四","上海","王五","北京","赵六","广州");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("---------------");
        Set<Map.Entry<String, String>> entries  = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
        System.out.println("---------------");

        //超过10对键值对Map方法：

        //1. 创建一个普通Map集合、
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "南京");
        hm.put("李四", "上海");
        hm.put("王五", "北京");
        hm.put("赵六", "广州");
        hm.put("田七", "武汉");
        hm.put("wangwu", "成都");
        hm.put("zhangsan", "上海");
        hm.put("lisi", "西安");
        hm.put("zhaoliu", "广州");
        hm.put("aaa", "111");
        hm.put("bbb", "222");
        hm.put("ccc", "333");
        //2.变Set
        Set<Map.Entry<String,String>> entries1 = hm.entrySet();
        //3.把entries1转换成数组后  调用toArray方法
        Map.Entry[] arr = new Map.Entry[0];
        //toArray方法：底层会比较集合长度和数组长度
        //如果集合长度 <= 数组长度, 直接把集合内容复制给数组
        //如果集合长度 > 数组长度，重新创建一个数组
        Map.Entry[] arr2 = entries1.toArray(arr);
        Map map1 = Map.ofEntries(arr2);
        System.out.println(map1);
        //map1.put("bbb", "111");错误

        System.out.println("---------------------------");
        //方法二：利用copyOf方法
        Map<String,String> map2 = Map.copyOf(hm);
        System.out.println(map2);
    }
}

/*
Immutable Collection
list.of(1,2,3)
Set.of(1,2,3)
Map.of("张三", 100, "李四", 80)
对于Map:

 */