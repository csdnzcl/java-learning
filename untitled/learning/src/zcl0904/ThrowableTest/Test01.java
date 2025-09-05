package zcl0904.ThrowableTest;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        /*
        需求：
            键盘录入自己心仪的女朋友姓名和年龄。
                - 姓名长度：3–18 位
                - 年龄范围：18–40 岁
            超出范围或格式错误视为异常数据，不能赋值，需重新录入，直到输入正确为止。
        提示：
            需考虑所有键盘录入异常情况，例如年龄超范围、年龄录入了“abc”等。*/

        Scanner sc = new Scanner(System.in);
        Girlfriend gf = new Girlfriend();
        while (true) {
            try {
                System.out.println("请输入你的女朋友的名字：");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("请输入你的女朋友的年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                //如果所有数据都是正确的，跳出循环
                break;
            }catch (NameFormatException e) {
                e.printStackTrace();
            }catch ( AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        System.out.println(gf);

    }
}

/*小知识点---toString()方法：
为什么 System.out.println(gf);打印不是地址值？
    答：执行System.out.println(gf);时，编译器会把代码翻译成：System.out.println(String.valueOf(gf));
    String.valueOf(obj)源码：return (obj == null) ? "null" : obj.toString();
    故System.out.println(gf); == 打印toString()内容

总结： 打印对象 → 调 toString → 没重写看 Object → 重写就走你
 */