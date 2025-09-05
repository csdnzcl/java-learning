package zcl0903.fangfayinyong.Test;
import java.util.*;
import java.util.stream.Stream;

public class Test01 {

    public static void main(String[] args) {
        /*
        需求：
            创建集合添加学生对象
            学生对象属性： name, age
        要求：
            获取姓名并放到数组中
            使用方法引用完成
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "xianwang-15", "xianzhang-16", "xianli-17");
        Stream<String> arr = list.stream().map(Student::new).map(Student::getName);

    }
}
