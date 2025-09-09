package day01;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        /*java.lang.String类代表字符串，java程序中的所有字符串文字（例如"avc")都为此类的对象
        字符串内容是不会发生改变的，它的对象在    创建后  不  能被  更改
        */
        //name 只是变量
        String name = "hello";//hello本身就是对象的内容，也是对象本身
        System.out.println(name);//hello
        name = "world";//并未修改字符串的内容，而是让变量name指向了一个新的字符串对象
        System.out.println(name);//world

        //String构造方法：
        //1.使用直接赋值的方式获取一个字符串对象
//编译器只是把字面量 "abc" 放到字符串常量池里，并让变量 s1 直接引用常量池中已经存在的那个 String 对象
        String s1 = "abc";
        String ss = "abc";//ss不会创建新的对象，而是复用串池已经存在的abc（对比new)
        System.out.println(s1);  //abc
        ss = "haha.md";
        System.out.println(ss);//创建haha对象，并使ss ---> haha对象

        //2.使用new的方式来获取一个字符串对象
        //空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "|");  //  @|

        //3. 传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);  //abc

        //4. 传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);  //abcd

        //5.传递一个字节数组，根据字节数组的内容创建一个新的字符串对象
        //应用场景：网络中传输的数据为字节信息
        byte[] bytes = {97, 98, 99, 100};
        String s5 = new String(bytes);
        System.out.println(s5); //abcd

//字符串的比较
        // == 的原理
        //1.基本数据类型，比较数据值
        //2.引用数据类型，比较地址值
//字符串中字符的比较：
        //1.boolean equals方法  完全一样为true----str1.equals(str2)
        //2.boolean equalsIgnoreCase  忽略大小写的比较---str1.equalsIgnoreCase(str2)
        //键盘录入的字符串是new出来的

//遍历字符串：
        //public char charAt(int index); //根据索引返回字符
        //public int length();  //返回此字符串的长度
        //vs数组 ：  数组名.length;     字符串对象.length ();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        for(int i = 0; i < str.length(); ++i) {
            char c  = str.charAt(i);
            System.out.println(c);
        }


    }
}

/*
| 方法签名                                             | 作用                                |
| ------------------------------------------------ | --------------------------------- |
| `String substring(int beginIndex)`               | 从 `beginIndex` 到末尾                |
| `String substring(int beginIndex, int endIndex)` | 从 [beginIndex,endIndex) |

 */