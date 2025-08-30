package day06;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);//[aaa, bbb, ccc]
        list.add(1, "ddd");
        System.out.println(list);//[aaa, ddd, bbb, ccc]
        String str = list.remove(0);
        System.out.println( str);
        System.out.println(list);//[ddd, bbb, ccc]
        System.out.println(list.get(1));
        System.out.println(list.set(1, "eee"));
        System.out.println(list);//[ddd, eee, ccc]
        //1. 迭代器:使用迭代器遍历不能使用集合的方法修改集合元素
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        */
        /*2. 增强for循环
        for(String str : list) {
            System.out.println(str);
        }
         */
        //3. lambda表达式
        /*list.forEach((String s) -> {
                    System.out.println(s);
                }
        )

         */
        //4. 列表迭代器
        /*ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("eee")){
                it.add("qqq");
            }
            System.out.println(s);
        }
/*
equals方法补充：
    对于引用数据类型，如果没有重写equals方法，那么equals方法的行为和==运算符是一样的，
    都是比较两个对象的地址值是否相同。例如，两个指向不同对象的引用，即使它们的内容相同，
    ==运算符的结果也是false。
但是String类重写了equals方法，比较的是字符串的内容
 */
        //5. 普通for
        /*
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        */

    }
}

/*
List系列集合特有方法：  List为抽象类，不能实例化对象，需要使用子类对象(eg:ArrayList)
    1. void add(int index, E element); 指定位置添加元素(依次往后移动）
    2. E remove(int index); //删除指定位置的元素并返回被删除的元素
    3. E set(int index, E element);//修改指定位置的元素，并返回被修改的元素
    4. E get(int index);//获取指定位置的元素

List集合遍历方式：
    1. 迭代器遍历: 需要删除元素
    2. 增强for循环：
    3. 普通for循环：想操作索引
    4. lambda表达式
    5. 列表迭代器：需要添加元素，只能使用列表迭代器，List独有
 */