package day02;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //1. 定义方式：
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        boolean flag = list.remove("aaa");
        String str = list.remove(0);

        list.set(0,"aaaa");
        list.set(1, "bbbb");

        System.out.println(flag);
        System.out.println(list);
        System.out.println(list);
        System.out.println(list.size());

    }
}

/*
集合：可变容器， 可以存引用数据类型（基本数据类型需要转为包装类）
数组：可以存基本数据类型和引用数据类型
底层处理：
1. 打印对象不是地址值，而是集合中存储数据内容
2. 在展示的时候会拿[]把所有的数据进行包裹
成员方法：
1. boolean add(E e)
添加元素，返回值表示是否添加成功
2. boolean remove(E e)
删除指定元素(从前往后），返回值表示是否删除成功
3. E remove(int index)
删除指定索引的元素，返回被删除元素
4. E set(int index, E e)
修改指定索引下的元素，返回原来的元素
5. E get(int index)
获取指定索引的元素
6. int size()
集合的长度，也就是集合中元素的个数

*/
