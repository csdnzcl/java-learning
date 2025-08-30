package day02.Testclass;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("zhangshan", 23, "男");
        Student stu2 = new Student("wangwu", 25, "男");
        Student stu3 = new Student("lisi", 18, "女");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAge);

    }
}
