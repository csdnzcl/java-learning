package day09;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18, 90, 80, 70);
        Student s2 = new Student("lisi", 19, 80, 90, 80);
        Student s3 = new Student("wangwu", 20, 70, 80, 90);
        Student s4 = new Student("zhaoliu", 21, 60, 80, 70);
        Student s5 = new Student("sunqi", 22, 50, 80, 90);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for(Student s : ts) {
            System.out.println(s);
        }


    }

}
