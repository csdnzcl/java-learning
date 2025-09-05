package day02.Polymorphism.Test;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhangshan");
        s.setAge(19);

        Teacher t = new Teacher();
        t.setAge(33);
        t.setName("wangqiang");

        Administrator a = new Administrator();
        a.setName("lisi");
        a.setAge(50);

        register(s);
        register(t);
        register(a);
    }
    public static void register(Person p) {
        p.show();
    }
}
