package zcl0905.FileTest;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("learning\\aaa");
        System.out.println(f1.mkdirs());
        //拼接父级路径和自己路径
        File src = new File(f1, "a.txt");
        boolean b = src.createNewFile();
        if(b) {
            System.out.println("创建成功");
        }
        else {
            System.out.println("创建失败");
        }
    }
}
