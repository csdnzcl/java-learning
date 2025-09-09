package zcl0905.IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        Java中编码的方法
            public byte[] getBytes()	默认方式编码
            public byte[] getBytes(String charsetName)	指定方式编码

        Java中解码的方法
            String(byte[] bytes)	默认方式解码
            String(byte[] bytes, String charsetName)	指定方式解码
         */

        //编码
        String str = "ai你哦";
        byte[] bytes = str.getBytes(); //utf-8
        System.out.println(Arrays.toString(bytes));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //解码
        String str2 = new String(bytes);
        System.out.println(str2);
        String str3 = new String(bytes2, "GBK");
        System.out.println(str3);
    }

}

/*
        GBK标准
        汉字占两个字节
        高位字节二进制一定是以1开头，转成十进制之后是一个负数
        （VS 英文---字节以0开头，正数）

        Unicode：万国码
        UTF-8：UTF-8编码---中文占三个字节

        乱码原因：
            1. 一个汉字占三个字节，一次性只读取一个字节
            2. 编码和解码方式不统一

        如何不产生乱码：
            1. 不要用字节流读取文本文件
            2. 编码解码时使用同一个码表、同一个编码方式

        拷贝不会导致乱码
         */