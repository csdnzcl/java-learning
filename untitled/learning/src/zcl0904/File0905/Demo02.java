package zcl0904.File0905;
import java.io.File;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {
        //判断方法：
        /*
        public boolean exists()---判断此路径名表示的File是否存在
        public boolean isDirectory()---判断此路径名表示的File是否为文件夹
        public boolean isFile()---判断此路径名表示的File是否为文件
        */
        File f1 = new File("D:\\javaFileTest\\Test01.txt");
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());

        //获取方法：
        /*
        public long length()---返回文件的大小（字节数量）
                            ---无法获取文件夹大小（累加所有文件）
        public String getAbsolutePath()---返回文件的绝对路径
        public String getPath()---返回定义文件时使用的路径
        public String getName()---文件：文件名.后缀   文件夹：文件夹名
        public long lastModified()---返回文件的最后修改时间（时间毫秒值）
        */
        System.out.println(f1.length());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println(f1.lastModified());
        long time = f1.lastModified();
        System.out.println(new Date(time));


    }
}

