package zcl0903.fangfayinyong;
import java.util.*;
import java.util.function.IntFunction;

public class FunctionDemo04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        /*Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));*/

        Integer[] arr = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}

/*
引用数组的构造方法：
格式：数据类型[]::new

数组类型和流中数据类型保持一致
 */