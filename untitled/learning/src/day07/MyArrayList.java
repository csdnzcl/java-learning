package day07;

import java.util.Arrays;

public class MyArrayList <T>{
    Object[] obj = new Object[10];
    int size = 0;
    public boolean add(T t) {
        obj[size++] = t;
        return true;
    }
    public T get(int index) {
        return (T)obj[index];
    }

    @Override
    public String toString(){
        return Arrays.toString(obj);//????????
    }
}
