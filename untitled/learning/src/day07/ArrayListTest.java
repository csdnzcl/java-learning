package day07;

public class ArrayListTest {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2.toString());
    }
}
