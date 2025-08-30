package day07.Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list, "aaa","bbb","ccc");
        System.out.println( list);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2, 1,2,3);
        System.out.println(list2);
    }
}
