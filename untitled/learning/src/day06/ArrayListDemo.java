package day06;

public class ArrayListDemo {
}

/*
ArrayList底层---数组
    空参创建，默认长度为0，添加第一个元素师，底层会创建一个新的长度为10的数组
    size:元素个数，下次存入位置
    存满扩容1.5，1.5不够，则新创建数组长度以实际为准
LinkedList集合
    双链表---查询慢（首尾快--特有API），增删快
    public void addFirst(E e)  在该列表开头插入指定的元素
    public void addLast(E e)   将指定的元素追加到此列表的末尾
    public E getFirst()        返回此列表中的第一个元素
    public E getLast()         返回此列表中的最后一个元素
    public E removeFirst()     从此列表中删除并返回第一个元素
    public E removeLast()      从此列表中删除并返回最后一个元素
 */