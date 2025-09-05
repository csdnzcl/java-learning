package day01;

import java.util.Scanner;
import java.lang.String;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true) {
            System.out.println("请输入一个字符串");
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                break;
            }else {
                System.out.println("当前输入不符合规则");
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); ++i) {
            sb.append(changeLuoMa(str.charAt(i)-'0'));
        }
        System.out.println(sb);
    }

    public static boolean checkStr(String str) {
        if(str.length() > 9) {
            return false;
        }
        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }

//  查表法：创建一个数组，将数字对应的罗马数字放在数组中，通过索引获取对应的值
    public static String changeLuoMa(int number) {
        String[] arr = {"", "I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[number];
    }

}

/*
*键盘录入一个字符串：
要求1：长度为小于等于9
要求2：只能是数字
    将内容变成罗马数字
下面是阿拉伯数字跟罗马数字的对比关系：
I-1、II-2、III-3、IV-4、V-5、VI-6、VII-7、VIII-8、IX-9
注意点：
罗马数字里面是没有0的
如果键盘录入的数字包含e，可以变成""（长度为0的字符串）
* */