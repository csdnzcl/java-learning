package zcl0907IO.Buffered;

import java.io.*;

public class BufferedReaderAndBufferedWriterDemo03 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("learning\\write.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("learning\\write.txt", true));
        bw.write("hello world");
        bw.newLine();
        bw.write("hello world");
        bw.newLine();
        bw.write("hello world");
        bw.newLine();
        bw.write("hello world");
        bw.newLine();
        bw.close();
    }
}

//字符缓冲流：
/*
特有方法：
    字符缓冲输入流特有方法：1. public String readLine()：读取一行数据，无数据可读，返回null---不读回车换行符
    字符缓冲输出流特有方法：1. public void newLine()：跨平台换行符
 */