package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(new Student("小龙女", 18), "贵州");
        hm.put(new Student("杨过", 20), "四川");
        hm.put(new Student("尹志平", 22), "云南");
        hm.put(new Student("小龙女", 18), "重庆");
        Set<Student> keys = hm.keySet();
        for(Student key : keys) {
            System.out.println(key + ":" + hm.get(key));
        }
        System.out.println("------------------");
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for(Map.Entry<Student, String> entry : entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("------------------");
        hm.forEach(new java.util.function.BiConsumer<Student, String> (){
            @Override
            public void accept(Student key, String value) {
                System.out.println(key + ":" + value);
            }
        });
    }
}

/*
HashMap特点
1. 是Map的一个实现类
2. 无额外的特有方法（Map）
3. 无序、不重复、无索引---键
4. 底层---哈希表结构---数组+链表（+红黑树）---hashCode和equals方法保证键唯一
         如果键存储的是自定义对象，重写equals和hashCode方法（值不需要重写）

TreeMap特点: 不重复，无索引，可排序---底层  红黑树---增删改查性能较好
TreeMap集合排序的两种方式：
    1. 实现Comparator接口，指定比较规则---默认
    2. 创建集合时传递Comparetor比较器对象，指定比较规则

HashMap  VS  TreeMap ： 一般使用HashMap, 需要排序使用TreeMap
 */