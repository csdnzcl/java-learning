package zcl0905.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
        字节输入流循环读取
    ---public int read()：读取数据，且读取一个数据就移动一次指针
         */

        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("learning\\write.txt");
        //循环读取
        int b;
        while((b= fis.read()) != -1) {
            System.out.print((char)b);
        }
        System.out.println((char)fis.read());
        fis.close();
    }
}
