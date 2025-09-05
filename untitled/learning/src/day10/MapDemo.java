package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo {
    public static void main(String[] args) {
        //1. creation
        Map<String, String> map = new HashMap<>();
        map.put("郭靖", "黄蓉");
        map.put("小龙女", "周星驰");
        map.put("小龙女", "杨过");//覆盖<“小龙女”, "周星驰">
        map.put("尹志平", "小龙女");
        System.out.println(map);

        //2. 遍历--键找值
        //2.1 获取所有键，存储到一个Set集合中
        Set<String> keys = map.keySet();
        //2.2 遍历单列集合
        for(String key : keys) {
            System.out.println(key + "=" + map.get(key));
        }
        //2.3 使用迭代器
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String key = it.next();
            System.out.println(key + "=" + map.get(key));
        }

        //3. 键值对
        //3.1 获取所有键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();//Entry是Map的内部接口
        //增强for
        for(Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        //使用迭代器
        Iterator<Map.Entry<String, String>> it2 = entries.iterator();
        while(it2.hasNext()) {
            Map.Entry<String, String> entry = it2.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        //lambda
        entries.forEach(( Map.Entry<String, String> entry) -> {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        });

        //3. lambda直接遍历
        map.forEach((String key, String value) -> {
                System.out.println(key + "=" + value);
            }
        );
    }
}
/*
双列集合(Map)：一次添加一对元素，键值对（  Entry对象  ）（键唯一，值不唯一，键值一一对应）
map ---> HashMap--->LinkedHashMap
 |
 |----->TreeMap

 一。 Map集合的常用方法：
 V put(K key,V value)  //添加（键存在，则覆盖，被覆盖的“值”返回，否则返回null）元素
 V get(Object key)  //根据键获取值
 V remove(Object key)  //根据 键 删除元素，返回“值”
 void clear()  //清空集合
 boolean containsKey(Object key)  //判断集合中是否包含指定的键
 boolean containsValue(Object value)  //判断集合中是否包含指定的值
 boolean isEmpty()  //判断集合是否为空
 int size()  //获取集合的长度-->键值对的个数

 二：Map的遍历方式
 1. 键找值:调用集合的   keySet()  方法，获取所有的键，存储到一个Set集合中，eg:Set<K> keys = map.keySet();
          而后，通过遍历Set集合，获取每一个键，在使用  get(key)  方法
 2. 键值对：调用集合的 entrySet() 方法，获取所有的键值对，存储到一个Set集合中，在通过getKey()和getValue()方法
 eg:Set<Map.Entry<K,V>> entries = map.entrySet();  在调用getKey()和getValue()方法
 3. lambda表达式: map.forEach((K key,V value) -> {})
 */