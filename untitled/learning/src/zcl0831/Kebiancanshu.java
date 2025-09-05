package zcl0831;

public class Kebiancanshu {
    public static void main(String[] args) {

//        JDK5
//        可变参数----格式：  属性类型...变量名   eg:int...args
        int sum = getSum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

    public static int getSum(int...args) {
        System.out.println(args.length);
        System.out.println(args);
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}

/*
可变参数小细节：
 1. 只写一个
 2. 写在最后
 */