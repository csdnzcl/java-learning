package zcl0904.ThrowableDemo;

public class Demo02 {
    public static void main(String[] args) {
        /*
            异常中常见方法
            public String getMessage()--返回throwable的详细信息字符串
            public String toString()--返回此可抛出的简短描述
            public void printStackTrace()--把异常的错误信息输出在控制台
                                         --不会终止程序，信息包含前两个函数的信息
         */

        int[] arr = {1, 2,3,4,5 ,6};
        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            String str = e.toString();
            System.out.println(message);
            System.out.println(str);
            e.printStackTrace();
        }
        System.out.println("程序继续执行");
    }
}
