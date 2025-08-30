package day02.Polymorphism;

public class Notes {
}
/*
多态：对象的多种形态
表现形式：父类类型 对象名称 = 子类对象；
前提：
    1. 有继承/实现关系
    2. 有父类引用指向子类对象
    3. 有方法重写
好处： 使用父类作为参数，可以接受所有子类对象，扩展性和便利

多态调用成员特点；
    1. 变量调用： 编译/运行看左边
        javac编译代码的时候，会看左边父类中有没有这个变量，如果有，编译成功，无则失败
        java运行代码时，实际获取的是左边成员变量的值
    2. 方法调用： 编译看左（类），运行看右（类）

多态优势：
    （重点）  定义方法的时候，使用父类型作为参数，可以接收所有子类对象，体现多态的扩展性与便利
            便于扩展和维护

弊端：不能调用子类特有功能----需要进行强转（不能瞎转）
instanceof关键字加强转：
    Animal a = new Dog();
    if(a instanceof Dog) {
        Dog d = (Dog) a;
        d.lookHome();
    }else if(a instanceof Cat) {
        Cat c = (Cat) a;
        c.catchMouse();
    }

JDK11新特性：判断+强转
if(a instanceof Dog d) {
    d.lookHome();
}else if(a instanceof Cat c) {
    c.catchMouse();}


 */