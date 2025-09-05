package day01;

public class StringBuilderDemo {
//StringBuilder可变的操作字符串的容器，可以高效拼接字符串以及将容器内容反转
//作用：提高字符串的操作效率
    //构造方法：
        //1. public StringBuilder(); 创建一个空白可变字符串对象，不含有任何内容
        //2. public StringBuilder(String str);  根据str内容创建可变字符串对象

    public static void main(String[] args) {

    //1.创建对象
        StringBuilder sb = new StringBuilder();
        //StringBuilder sb = new StringBuilder("abc");
    //2.结尾添加字符串
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
        System.out.println(sb); //aaabbbcccddd


    //3.再把StringBuilder变回字符串
        String str = sb.toString();
    //4.字符串反转
        sb.reverse();
        System.out.println(str); //aaabbbcccddd
        System.out.println(sb);//dddcccbbbaaa

    }
}
//扩展底层原理：
/*
 *StringBuilder:可变字符串
 *
 *  1. 字符串拼接的底层原理：如果很多字符串 变量 拼接，不要直接+。在底层会创建多个对象，浪费时间、性能
 * 有变量的拼接每一行拼接的代码都会在内存中创建新的字符串，浪费内存，会产生新对象（new)
 * 无变量的拼接会复用串池的字符串（"a" + "b" + "c")
 *
 * 2. StringBuilder提高效率拼接：
 *   所有要拼接的内容都会往StringBuilder中放，不会创建很多无用的空间，节约内存
 * 3. StringBuilder源码分析：
 * 扩容机制： 1. 默认扩容capacity * 2 + 2;  （默认capacity = 16)
 *          2. 默认扩容不够，则重新创建符合容量的数组
 *          sb.capacity();   sb.length();
 * append方法：结尾添加字符串
 * reverse方法：反转字符串
 * toString方法：把StringBuilder对象转换成String对象
 * charAt方法：获取指定索引位置的字符
 * */
