package day08;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class SetNotes {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean b1 = set.add("hello");
        boolean b2 = set.add("hello");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(set);
        set.add("world");
        set.add("java");
        System.out.println(set);
        //迭代器遍历
        /**Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/
        //增强for遍历
        /**for(String str : set) {
            System.out.println(str);
        }*/
        //lambda表达式
//        set.forEach(   (String s) -> {
//            System.out.println(s);
//        });

        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}

/*
List集合：存储有序、有索引、可重复的元素
VS
Set（接口）集合：存储无序、无索引、不可重复的元素
（无索引，增强for遍历）
Set接口中的方法基本与Collection的API一致
    public boolean add(E e) 把给定的对象添加到当前集合中
    public void clear() 清空集合中所有的元素
    public boolean remove(E e) 把给定的对象在当前集合中删除
    public boolean contains(Object obj) 判断当前集合中是否包含给定的对象
    public boolean isEmpty() 判断当前集合是否为空
    public int size() 返回集合中元素的个数/集合的长度

Set系列集合：
1. HashSet:无序、不重复、无索引
2. LinkedHashSet:有序、不重复、无索引
3. TreeSet:可排序、不重复、无索引

HashSet:  （JDK8以前，数组存储，链表存储）（JDK8以后，数组存储，链表存储，红黑树存储）
    哈希值： 1. 如果没有重写hashCode()方法，不同对象计算出的哈希值是不同的
           2.如果重写了hashCode方法，不同对象只要属性值相同，计算出的哈希值就一样
           3. 但是在小部分情况，不同属性值或地址值计算出来的哈希值也可能一样（哈希冲突）
    int index = (数组长度-1) & 哈希值;

    底层结构：
    JDK8以后，当链表的长度大于8，且当前数组的长度大于64时，链表会变成红黑树
    如果集合中存储的是自定义的对象，则该对象所在类必须重写hashCode()和equals()方法
            ----不重写，则hashCode()和equals()均是比较地址值
    （String和Integer对象的hashCode()和equals()方法已经重写好了）
    重写hashCode()和equals():

LinkedHashSet: 有序：保证存储和取出顺序一致---每个元素多了一个双链表的机制记录存储的顺序
               不重复、无索引



 */