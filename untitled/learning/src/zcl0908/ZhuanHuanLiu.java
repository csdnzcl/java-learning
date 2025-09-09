package zcl0908;

public class ZhuanHuanLiu {
}

/*
转换流：将字节流转换为字符流
    InputStreamReader：将字节输入流转换为字符输入流
    InputStreamReader is = new InputStreamReader(new FileInputStream("learning\\write.txt"));
    替代方案：使用其父类
    FileReader fr = new FileReader("learning\\write.txt", charset.forName("utf-8"));

    OutputStreamWriter：将字节输出流转换为字符输出流
    OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("learning\\test.txt"));
    FileWriter fw = new FileWriter("learning\\test.txt", charset.forName("utf-8"));
 */