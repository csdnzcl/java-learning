package zcl0903.fangfayinyong;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
        //需求：创建一个数组，进行倒序排序
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,8};
        //匿名内部类
        /*Arrays.sort(arr,new Comparator<Integer> () {
            @Override
            public int compare(Integer o1,Integer o2) {
                return o2-o1;
            }
        });
        for (Integer i : arr) {
            System.out.print(i + " ");
        }*/
        //Lambda表达式
       /* Arrays.sort(arr, (o1, o2) -> o2-o1);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }*/

        //方法引用
        Arrays.sort(arr,Demo01::compare);
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int  compare(int a, int b) {
        return a - b;
    }
}

/*
方法引用：把已有方法拿过来用，当做  函数式接口 中 抽象方法 的方法体---类名::方法名


1. 引用静态方法
    类名::静态方法
2。 引用成员方法
    对象::成员方法
    this::成员方法
    super::成员方法
3. 引用构造方法
    类名::new
4. 使用类名引用成员方法
    类名::成员方法
5. 引用数组的构造方法
    数据类型[]::new
 */