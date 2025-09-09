package zcl0905.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        /*
        文件拷贝：小文件拷贝--------read()
        大文件拷贝：---public int read(byte[] buffer)
         */

        //创建输入/输出流对象
        FileInputStream fis = new FileInputStream("learning\\write.txt");//输入流，输入程序读取的文件
        FileOutputStream fos = new FileOutputStream("learning\\test.txt");//输出流，输出程序写入的文件
        //2. 拷贝
        int b;
        while((b = fis.read()) != -1) {
            fos.write(b);
        }

        //一定记得   释放资源-----先开后释放
        fos.close();
        fis.close();

        FileInputStream fis2 = new FileInputStream("learning\\write.txt");
        FileOutputStream fos2 = new FileOutputStream("learning\\test.txt");
        byte[] bytes = new byte[5];
        int len;
        while((len = fis2.read(bytes)) != -1) {
            fos2.write(bytes,0,len);
        }
        fos2.close();
        fis2.close();

    }
}

/*
大文件拷贝：public int read(byte[] b)---返回值：本次读取到了多少个字节数据
    ---一次读一个字节数组---每次读取会尽可能把数组装满
    ---一般数组越大拷贝越快，但是数组有内存占用，故不能过大
    ---建议数组大小为1024的整数倍---eg: 1024*1024*5 == 5M
 */