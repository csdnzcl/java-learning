package day02.Testclass;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil(){}

    public static int getMaxAgeStudent(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if(max < age) {
                max = age;
            }
        }
        return max;
    }
}

/*
工具类
私有化构造方法（不需要对象）
方法定义为静态---无对象，psvm为静态
只用于其他类调用其中的方法，而不生成对象
调用方式---(包名.)类名.函数名
 */
