package day08;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.function.Consumer;


public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(2);
        ts.add(1);
        ts.add(4);
        System.out.println(ts);//[1, 2, 3, 4],添加时排序
        //遍历：
        //1. 迭代器
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            Integer i = it.next();//int i = it.next();
            System.out.println(i);
        }
        //2. 增强for循环
        for(Integer i : ts) {
            System.out.println(i);
        }
        //3. lambda表达式
        ts.forEach((i) -> {
            System.out.println(i);
        });

        //默认排序
        TreeSet<Student> ts1 = new TreeSet<>();
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 25);
        Student s3 = new Student("wang", 18);
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        System.out.println(ts1);


        //比较器排序
        //o1:表示当前要添加的元素
        //o2:表示已在红黑树的元素
        //返回值规则和之前一样---返回值为负数，当前添加元素存左边； 返回值为正数，当前添加元素存右边； 0，舍弃
        TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int i =o1.length() - o2.length();
                //如果长度一致，按首字符排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        ts2.add("c");
        ts2.add("ab");
        ts2.add("df");
        ts2.add("qwer");
        ts2.add("zhou");
        System.out.println(ts2);

    }

}

/*  TreeSet:
不重复，无索引，  可排序（默认升序）---对于字符、字符串（首字母）：按照字符在ASCII码表中的数字升序排列
基于红黑树实现排序，增删改查性能都较好

TreeSet的两种比较方式：
方式一：默认排序/自然排序：
javabean类  实现 Comparable接口，重写compareTo方法（指定规则）
方式二：比较器排序：
创建TreeSet对象时，传递比较器Comparator指定规则
 */

/*
默认ArrayList集合---基于数组的
若想要集合中的元素可重复，且增删操作明显多于查询----LinkedList集合
如果想对元素去重----HashSet---基于哈希表实现
如果想对元素去重且保证存取顺序---LinkedHashSet---基于哈希表和双链表--效率低于HashSet
排序---TreeSet---基于红黑树实现
 */