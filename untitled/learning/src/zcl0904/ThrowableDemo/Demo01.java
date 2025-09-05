package zcl0904.ThrowableDemo;

public class Demo01 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[10]);
            System.out.println("程序是否执行这里????????");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("程序是否执行这里");
        }
        System.out.println("程序继续执行");

        /*System.out.println("---------------");

        try {
            throw new RuntimeException("出错");
        } finally {
            System.out.println("finally 一定执行");
        }
        System.out.println("这里永远到不了"); // 编译器直接提示 Unreachable code*/
    }
}

/*Notes:
  java.lang.Throwable
      java.lang.Error
      java.lang.Exception
           |----> eg: RuntimeException--NullPointerException、ArrayIndexOutOfBoundsException……
           |----->Others

编译时异常：Exception--核心在于提醒程序员检查本地信息
运行时异常：RuntimeException--程序运行过程中出现的问题，比如：数组越界、空指针异常、算术异常、类NotFoundException……

异常作用：
    1. 查询bug的关键参考信息
    2. 可作为方法内部的一种特殊返回值，告诉调用者底层执行情况

处理异常方式：
    1. JVM默认处理方式----异常相关信息输出在控制台，程序停止执行，下面代码不再执行
    2. 自己处理（捕获异常）：让程序继续往下执行
        格式：
        try{
            可能出现异常的代码
        }catch(异常类名 变量名){
            异常处理代码
        }finally{
            一定会执行的代码
        }


扩展---灵魂四问：
1. 如果try中没有遇到问题，怎么执行？
    答：  try 里所有代码顺序执行 → 跳过所有 catch → 一定会进入 finally（如果有）
          → 继续执行 try-catch-finally 之后的代码。

2. 如果try中可能会遇到多个问题，怎么执行？
    答： 会写多个catch于之对应---如果捕获多个异常，
        这些异常中如果存在父子关系，那么子类异常必须写在前面
        在JDK7后，可在catch中写多个异常，用|隔开eg:catch(IOException | RuntimeException e){…………}

3. 如果try中遇到的问题没有被捕获，怎么执行？
        答： 异常会 沿着调用栈向上传递（main → JVM）。
            finally 依旧会执行。
            try-catch-finally 之后的代码 不会执行，直到被上层 catch 或 JVM 终止程序。

4. 如果try中遇到了问题，那么try下面的其他代码还会执行吗？
        答：不会，直接跳到catch中处理异常，try下面的代码不再执行
 */