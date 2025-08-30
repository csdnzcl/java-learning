package day10;

import java.util.TreeMap;

public class TestDemo1 {
    public static void main(String[] args) {
        //1. 创建集合
        TreeMap<Student, String>  tm = new TreeMap<>();
        //2.创建三个学生对象
        Student s1 = new Student("小王", 18);
        Student s2 = new Student("小张", 19);
        Student s3 = new Student("小李", 20);
        //3.添加元素
        tm.put(s1, "beijing");
        tm.put(s2, "shanghai");
        tm.put(s3, "guangzhou");

        System.out.println( tm);
    }

}
