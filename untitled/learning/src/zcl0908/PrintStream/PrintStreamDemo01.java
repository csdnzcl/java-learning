package zcl0908.PrintStream;

import java.io.*;
import java.nio.charset.Charset;

public class PrintStreamDemo01 {
    public static void main(String[] args) throws IOException {

        /*
        字节打印流

        public PrintStream(OutputStream/OutputStream/File/String)  关联字节输出流/文件/文件路径
        public PrintStream(String fileName, Charset charset)        指定字符编码
        public PrintStream(OutputStream out, boolean autoFlush)    自动刷新
        public PrintStream(OutputStream out, boolean autoFlush, String encoding) 指定字符编码且自动刷新

        字节流底层没有缓冲区，开不开自动刷新都一样

        成员方法                                说明
        public void write(int b)                   常规方法：规则跟之前一样，将指定的字节写出
        public void println(Xxx xx)                特有方法：打印任意数据，自动刷新，自动换行
        public void print(Xxx xx)                  特有方法：打印任意数据，不换行
        public void printf(String format, Object... args) 特有方法：带有占位符的打印语句，不换行
         */

        PrintStream prt = new PrintStream(new FileOutputStream("learning\\test.txt"),true, Charset.forName("UTF-8"));
        prt.println(97);
        prt.close();

        //字符打印流：有缓冲区，更高效-------构造/成员方法和字节流一样
        PrintWriter pw = new PrintWriter(new FileWriter("learning\\test.txt"));
        pw.println(97);
        pw.print(97);
        pw.printf("%.2f", 9.9999);
        pw.close();


    }
}

//打印流：
/*
打印流只可读，不可写，数据原样写出
打印一次数据 = 写出 + 换行 + 刷新
 */