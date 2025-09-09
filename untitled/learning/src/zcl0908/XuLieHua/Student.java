package zcl0908.XuLieHua;
import java.io.*;

//Serializable接口里面没有抽象方法，标记型接口
//一旦实现这个接口，那么就表示当前的Student类可以被序列化
public class Student implements Serializable{
    //serialVersionUID:版本号---序列化后，修改javabean类，再次反序列化，不出问题
    @Serial
    private static final long serialVersionUID = -5369561766381513491L;
    //private static final long serialVersionUID = 1L;// 序列化版本号
    private String name;
    private int age;
    // transient顺泰关键字--------不会把当前属性序列化到本地文件
    private transient String address;

    public Student() {}

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
