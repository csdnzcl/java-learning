package day08;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{ name= " + name + '\'' +
                ", age=" + age +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public int compareTo(Student o) {

        return this.getAge() - o.getAge();//this:要添加对象 o:红黑树已有对象,升序
        //返回值为正数,this添加到右边
        // this.getAge() - o.getAge() > 0, 右边
        // this.getAge() - o.getAge() < 0, 左边
        //return o.getAge() - this.getAge();//降序
    }
}
