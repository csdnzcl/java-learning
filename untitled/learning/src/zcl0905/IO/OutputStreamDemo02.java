package zcl0905.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /*
        换行写：
            Windows：\r\n
            Linux：\n
            Mac：\r
        续写：
            FileOutputStream(String path, boolean append);
            append为true--续写，创建对象不会清空文件
            false---创建对象会清空文件-----------append默认为false
         */
        FileOutputStream fos = new FileOutputStream("learning\\write.txt", true);

        //write传递字节数组细节----可使用String的getBytes()方法装换成byte[]
        String str = "\r\nhello world";
        String str1 = "\r\n你好";
        byte[] bytes = str.getBytes();
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes);
        fos.write(bytes1);
        fos.close();



    }
}
