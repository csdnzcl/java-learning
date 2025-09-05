package zcl0903.fangfayinyong;
 import java.util.*;
 import java.util.function.Function;
 import java.util.stream.Collectors;

public class FunctionDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa", "bbb", "ccc", "ddd", "eee");
        /*list.stream().map(new Function<String, String>(){
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.print(s + "  "));*/

        Set<String> collect = list.stream().map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(collect);
    }
}

/*
方法引用（类名引用成员方法
    类名::成员方法-----------不能引用所有类中的成员方法
规则：
函数式接口，方法存在，功能满足
被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值保持一致

抽象方法形参详解：
第一个参数：
表示被引用方法的调用者，决定了可以引用哪些类中的方法-----String 只能引用 String 类中的方法
在 Stream 流当中，第一个参数一般都表示流里面的每一个数据。
假设流里面的数据是字符串，那么使用这种方式进行方法引用，只能引用 String 这个类中的方法。

第二个参数到最后一个参数：
跟被引用方法的形参保持一致。
如果没有第二个参数，说明被引用的方法需要是无参的成员方法。




toUpperCase()源码
public String toUpperCase() {
    return toUpperCase(Locale.getDefault());
}
 */