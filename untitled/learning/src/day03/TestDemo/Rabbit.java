package day03.TestDemo;

public class Rabbit extends Animal{

    public Rabbit(String name,int age) {
        super(name,age);
    }

    public Rabbit() {
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
