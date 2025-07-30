package day01;
import java.lang.String;
public class Test02 {
    public static void main(String[] args) {
        String strA = "abcdef";
        String strB = "cdefba";
        System.out.println(check(strA,strB));
    }
    public static boolean check(String a, String b) {
        if(a.length() != b.length()) return false;
        int n = a.length();
        boolean flag = false;
        for(int i = 0; i < n; ++i) {
            flag = a.equals(b);
            if(flag)
                break;
            else{
                char first = a.charAt(0);
                String end = a.substring(1);//截取函数
                a = end + first;
            }
        }
        if(flag)
            return true;
        return false;
    }
}

/*
调整字符串
给定两个字符串，A和B。
A的旋转操作就是将A最左边的字符移动到最右边。
例如，若A="abcde"，在移动一次之后结果就是"bcdea"。
如果在若干次调整操作之后，A能变成B，那么返回True。
如果不能匹配成功，则返回False。
*/