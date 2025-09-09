package zcl0905.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo07 {
    public static void main(String[] args) throws IOException {
        /*
        1. 创建对象
            public FileWriter(File file)	创建字符输出流，关联本地文件
            public FileWriter(String pathname)	创建字符输出流，关联本地文件
            public FileWriter(File file, boolean append)	创建字符输出流，关联本地文件，可指定是否追加写入
            public FileWriter(String pathname, boolean append)	创建字符输出流，关联本地文件，可指定是否追加写入

        2. 写出数据
            void write(int c)	写出一个字符
            void write(String str)	写出一个字符串
            void write(String str, int off, int len)	写出字符串的一部分
            void write(char[] cbuf)	写出一个字符数组
            void write(char[] cbuf, int off, int len)	写出字符数组的一部分

        3. 释放资源
            public void close()	释放资源 / 关闭流
         */

        FileWriter fw = new FileWriter("learning\\write.txt");
        String str = "你好，世界";
        char[] chars = {'a', 'b', 'c','你','好','世','界'};
        fw.write(str + "\r\n");
        fw.write(chars);
        fw.write(25105);
        fw.close();


    }
}

/*
字符流原理解析
一：输入流：
① 创建字符输入流对象
底层：关联文件，并创建缓冲区（长度为8192的字节数组）

② 读取数据
底层：1. 判断缓冲区中是否有数据可以读取
     2. 缓冲区没有数据：就从文件中获取数据，装到缓冲区中，每次尽可能装满缓冲区
如果文件中也没有数据了，返回-1
     3. 缓冲区有数据：就从缓冲区中读取。
空参的read方法：一次读取一个字节，遇到中文一次读多个字节，把字节解码并转成十进制返回
有参的read方法：把读取字节，解码，强转三步合并了，强转之后的字符放到数组中

二：输出流：
1. 创建对象：  同输入流
2. 写出数据：
    如果不调用flush/close方法，调用write方法，数据会保存在缓冲区中，满了再写入文件

*/

//flush和close方法：
// public void flush()  : 将缓冲区中的数据，刷新到本地文件中---刷新可继续往文件中写出数据
// public void close()  : 释放资源/关流
