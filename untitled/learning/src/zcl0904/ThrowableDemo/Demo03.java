package zcl0904.ThrowableDemo;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(max);
    }

    public static int getMax(int[] arr) throws RuntimeException{
        if(arr == null) {
            //手动创建、抛出异常对象，并把这个异常交给调用者处理
            throw new NullPointerException("数组不能为空");
            //此时方法结束
        }
        if(arr.length == 0) {
            throw new RuntimeException("数组不能为空");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}

/*
抛出处理：
1. throws:声明一个异常，告诉调用者，这个方法可能出现的异常
    格式： public void methodName() throws 异常类名1，异常2……{}
    编译时异常： 必须要写
    运行时异常： 可以不写----RuntimeException


2. throw: 手动抛出异常对象，交给调用者，
            下面代码不再执行
    格式： throw new 创建异常对象



 */