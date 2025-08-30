package day07;

public class GenericsNotes {

}

/*
泛型:可以在编译阶段约束操作的数据类型--only引用数据类型
泛型类：定义一个类时，前面加上<T>
好处：把运行时期的问题提前到了编译期间，避免了强制类型转换可能出现的异常
伪泛型--泛型的擦除： java文件存在泛型，java编译为class文件时，泛型消失（Object）
细节：指定泛型的具体类型后，传递数据时，可以传入该类类型或子类类型
     默认Object   ，不能为基本数据类型

泛型类：当一个类中，某个变量的数据类型不确定时， public class 类名 <T> {}
泛型方法：方法中形参类型不确定时，可使用<T> ， eg： public <T> 返回值类型 方法名(形参类型 变量名){}
泛型接口：修饰符 interface 接口名 <T> {} ,  eg: public interface List <T> {}
     使用：1. 实现类给出具体类型(创建对象无需给出具体类型） eg:public class 类名 implements 接口名<String>
          2. 实现类延续泛型，创建对象时再确定  eg:public class 类名<T> implements 泛型接口<T> {}
泛型的继承和通配符
    泛型不具备继承性--泛型里面写的什么类型，那么只能传递该类型
    eg: public static void method(ArrayList<ye> list){}----
    调用method方法时，实参只能是ArrayList<ye>,不能是ye的子类父类……
    但是数据具备继承性
通配符： ?  : 表示不确定的类型-----作用： 限定类型的范围
        ? extends E:表示可以传递E或者E的子类eg: public void show(List<? extends ye> list){}
        ? super E:表示可以传递E或者E的父类,eg: public void show(List<? super er> list){}
 */
