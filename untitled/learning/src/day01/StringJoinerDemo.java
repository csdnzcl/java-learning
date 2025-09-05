package day01;

import java.util.StringJoiner;
public class StringJoinerDemo {
    //可变的操作字符串的容器，可以高效方便拼接字符串
    //拼接可以指定  间隔、开始、结束符号
    public static void main(String[] args) {
        //1.StringJoiner("间隔符号");
        StringJoiner sj = new StringJoiner("---");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);//aaa---bbb---ccc
        System.out.println(sj.length());//15

        //2.StringJoiner("间隔", "开始", "结束");
        StringJoiner sj2 = new StringJoiner("," , "[", "]");
        sj2.add("aaa").add("bbb").add("ccc");
        System.out.println(sj2);//[aaa,bbb,ccc]
        System.out.println(sj2.length());//13

        System.out.println(sj2.toString());
        System.out.println(sj2.toString().length());
    }
}
/*
方法：
    1. add(String);  //StringBuilder--append方法
    2. toString();
    3. length();

 */
