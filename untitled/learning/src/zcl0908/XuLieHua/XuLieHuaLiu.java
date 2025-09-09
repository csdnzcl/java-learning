package zcl0908.XuLieHua;

import java.io.*;

public class XuLieHuaLiu {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化流
        Student stu = new Student(18, "张三");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("learning\\write.txt"));
        oos.writeObject(stu);
        oos.close();
        //反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("learning\\write.txt"));
        Student o = ( Student) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
