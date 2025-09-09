package zcl0905.IO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo06 {

    public static void main(String[] args) throws IOException {
        /*
        第一步：创建对象
            public FileReader(File file)	创建字符输入流，关联本地文件
            public FileReader(String pathname)	创建字符输入流，关联本地文件

        第二步：读取数据
            public int read()	读取一个字符，读到末尾返回 -1
            public int read(char[] buffer)	读取多个字符到数组，读到末尾返回 -1

        第三步：释放资源
            public void close()	释放资源 / 关闭流
         */

        //创建对象，关联本地文件
        FileReader fr = new FileReader("learning\\write.txt");
        //读取数据read()
        //字符流底层是字节流，默认读一个字节，如果遇到中文会一次读多个
        //读取后，底层会解码并转成十进制并返回
        //
        int ch;
        while((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();

        System.out.println("--------------------------------");
        FileReader fr2 = new FileReader("learning\\write.txt");
        char[] buffer = new char[5];
        int len;
        //含参read方法：读取数据，解码，强转合并，把强转之后的字符放到数组当中
        while((len = fr2.read(buffer))!= -1) {
            System.out.print(new String(buffer, 0, len));
        }
        fr2.close();
    }
}

/*
字符流 = 字节流 + 字符集------纯文本文件
       抽象类
------>Reader-----FileReader, ……
------>Writer-----FileWriter, ……


 */