package zcl0907IO.Buffered;

import java.io.*;

public class BufferedInputStreamDemo01 {

    public static void main(String[] args) throws IOException {
        /*
        需求：利用字节缓冲流拷贝文件
        字节缓冲输入流构造方法：public BufferedInputStream(InputStream is)
        字节缓冲输出流构造方法：public BufferedOutputStream(OutputStream os)
         */

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("learning\\write.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("learning\\test.txt"));

        //1. 一个一个读
        /*int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }*/

        //2. 数组读
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}

//字节缓冲输入流