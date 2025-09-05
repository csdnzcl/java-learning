package zcl0903.streamTest;

import java.util.*;
import java.util.stream.Collectors;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();
        Collections.addAll(manList, "蔡徐坤-24", "王源-25", "王俊凯-26","易烊千玺-24");
        Collections.addAll(womanList,"赵丽颖-35","杨颖-36", "林志玲-37","王宝强-38","杨哈哈-18");
        Map<String, Integer> collect = manList.stream()
                .filter(s -> s.split("-")[0].length() == 3)
                .limit(2)
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt( s.split("-")[1])
                ));
        System.out.println(collect);

        System.out.println("------------------");

        womanList.stream()
                .filter(s->s.split("-")[0].startsWith("杨"))
                .skip(1)
                .forEach(s -> System.out.println(s.split("-")[0] + " " + s.split("-")[1]));
    }
}
