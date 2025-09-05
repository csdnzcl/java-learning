package zcl0905.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /*
        实现需求：
            将一段文字写出到本地文件中。（暂时不写中文）
        实现步骤：
            创建对象
            写出数据
            释放资源
        */

        /*
        1. 创建字节输出流对象
                细节1：参数可以是字符串表示的路径(底层会创建File），也可以是 File 对象。
                细节2：如果文件不存在，会创建一个新文件，但要保证父级路径存在。
                细节3：如果文件已存在，则会清空原文件内容。
        2. 写数据
                细节：write 方法的参数是整数，但实际上写入文件的是该整数在 ASCII 表中对应的字符。
        3. 释放资源
                每次使用完流之后都要释放资源---避免一直占有
        */
        //创建对象
        FileOutputStream fos = new FileOutputStream("learning\\a.txt");
        //写出数据
        fos.write(97);
        fos.write(98);
        //释放资源
        fos.close();

        /*
        FileOutputStream写数据的三种方式(void)
        1. write(int b)---一次写一个字节数据
        2. write(byte[] b)---一次写一个字节数组数据
        3. write(byte[] b, int off, int len)---一次写一个字节数组的一部分数据
                              off---起始索引
                              len---个数
         */

        FileOutputStream fos1 = new FileOutputStream("learning\\write.txt");
        //1.
        fos1.write(97);
        fos1.write(98);
        //2.
        byte[] bytes = {97,98,99,100,101};
        fos1.write( bytes);
        //3.
        byte[] bytes1 = {65,66,67,68,69};
        fos1.write(bytes1,0,2);
        fos1.close();

    }
}

/*
IO流：存储和读取数据的解决方案
分类：
1. 按照流的方向：输入流（读取）、输出流（写出）
2. 操作文件类型：字节流（ALL）、字符流（纯文本文件）

IO流体系：
 |----->字节流     抽象类
          |---->InputStream
          |---->OutputStream
 |----->字符流
          |---->Reader
          |---->Writer
*/