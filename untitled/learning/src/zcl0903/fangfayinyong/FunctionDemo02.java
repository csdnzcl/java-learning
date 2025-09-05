package zcl0903.fangfayinyong;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionDemo02 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        //1.引用静态方法
        System.out.println("---------引用静态方法---------");
        list.stream()
                .map(Integer::parseInt)
                .forEach(i -> System.out.print(i + "  "));
        System.out.println();
        //2.引用成员方法
        System.out.println("--------引用成员方法----------");
        list.stream().filter(new FunctionDemo02()::test)
                .forEach(s -> System.out.print( s + " "));
        System.out.println();

        //3.引用构造方法
        System.out.println("--------引用构造方法----------");
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌-15","周芷若-14", "赵敏-13", "小昭-12", "小華-11");
        List<Student> list2 = list1.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] arr = s.split("-");
                String name = arr[0];
                int age = Integer.parseInt(arr[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());
        for (Student student : list2) {

            System.out.print( student.getName() + " " + student.getAge());
            System.out.print( "  ");
        }
        System.out.println();

        //引用构造方法---方法引用
        System.out.println("--------引用构造方法（方法引用）----------");
        list1.stream().map(Student::new) //---重点
                .forEach(s -> System.out.print(s.getName() + " " + s.getAge() + "  "));
    }





    public boolean test(String s) {
        if(Integer.parseInt(s) % 2 == 0) {
            return true;
        }
        return false;
    }
}

/*
1. 引用静态方法---类名::静态方法
2. 引用成员方法---类对象名::成员方法  // this:: // super::
   ————必须创建对象（new一个）-----静态方法中没有this和super
3. 引用构造方法---类名::new---创造对象
4. 其他调用方式：
    类名::成员方法  eg: String::substring

扩展： 只有一个抽象方法的接口  ==  函数式接口
 */