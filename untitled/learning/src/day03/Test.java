package day03;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("haaa",1);
        System.out.println(f.getName() + "," + f.getAge());

        f.eat();
        f.swim();

        Rabbit r = new Rabbit("hello", 2);
        System.out.println(r.getName() + "," + r.getAge());

        r.eat();


    }
}
